package kz.essc.uis.rest.user;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import kz.essc.uis.bean.core.SecurityBean;
import kz.essc.uis.bean.user.UserBean;
import kz.essc.uis.ejb.user.UserWrapper;

@Path("/secure/users")
@Produces({ MediaType.APPLICATION_JSON})
@Consumes({ MediaType.APPLICATION_JSON})
public class UserRest {

	@Context
	HttpServletRequest request;
	
	@Context
	HttpServletResponse response;
	
	@Inject
	SecurityBean securityBean;
	
	@Inject
	UserBean userBean;
	
	@GET
	@Path("/")
	public List<UserWrapper> getUsers() {
		return userBean.getUsers();
	}
	
	@GET
	@Path("/{id}")
	public UserWrapper get(@PathParam("id") Long id) {
		return userBean.get(id);
	}
	
	
	@POST
	@Path("/s")
	public String get(@PathParam("user") String user) {
		return "post"+user.toString();
//		try {
//			return userBean.get(id);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
	}
	
	@POST
	@Path("/")
	public UserWrapper add(UserWrapper userWrapper) throws IOException {
		if (securityBean.hasRole(request.getUserPrincipal().getName(), "dean")) {
			return userBean.add(userWrapper);
		}
		else {
			response.sendError(HttpServletResponse.SC_PRECONDITION_FAILED);
			return null;
		}
	}
	
	@PUT
	@Path("/{id}")
	public UserWrapper edit(@PathParam("id") Long id, UserWrapper userWrapper) throws IOException {
		if (securityBean.hasRole(request.getUserPrincipal().getName(), "dean")) {
			return userBean.edit(id, userWrapper);
		}
		else {
			response.sendError(HttpServletResponse.SC_PRECONDITION_FAILED);
			return null;
		}
	}
	
	@DELETE
	@Path("/{id}")
	public int delete(@PathParam("id") Long id) throws IOException {
		if (securityBean.hasRole(request.getUserPrincipal().getName(), "dean")) {
				return userBean.delete(id);
		}
		else {
			response.sendError(HttpServletResponse.SC_PRECONDITION_FAILED);
			return -3;
		}
	}
	
	@GET
	@Path("/login/{login}")
	public UserWrapper getUserByLogin(@PathParam("login") String login) {
		return userBean.getUserByLogin(login);
	}
	
	@GET
	@Path("/logout")
	public boolean logout() {
		try {
			HttpSession session = request.getSession();
			System.out.println("before");
			System.out.println(request.getUserPrincipal().getName());
			System.out.println( session.getId() );
			
			request.logout();

			System.out.println("after");
			System.out.println(request.getUserPrincipal());
			System.out.println( session.getId() );
			
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			
			return false;
		}
	}
}