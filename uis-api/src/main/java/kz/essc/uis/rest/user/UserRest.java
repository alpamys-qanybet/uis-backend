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

import kz.essc.uis.bean.user.UserBean;
import kz.essc.uis.ejb.user.UserWrapper;
import kz.essc.uis.rest.SecureRest;

@Path("/secure/users")
@Produces({ MediaType.APPLICATION_JSON})
@Consumes({ MediaType.APPLICATION_JSON})
public class UserRest {
	
	@Inject
	UserBean userBean;
	
	@Context
	HttpServletRequest request;
	
	@Context
	HttpServletResponse response;
	
	@GET
	@Path("/")
	public List<UserWrapper> getUsers() {
		try {
			return userBean.getUsers();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GET
	@Path("/{id}")
	public UserWrapper get(@PathParam("id") Long id) {
		try {
			return userBean.get(id);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
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
	public UserWrapper add(UserWrapper userWrapper) {
		return userBean.add(userWrapper);
	}
	
	@PUT
	@Path("/{id}")
	public UserWrapper edit(@PathParam("id") Long id, UserWrapper userWrapper) throws IOException {
		return userBean.edit(id, userWrapper);
	}
	
	@DELETE
	@Path("/{id}")
	public int delete(@PathParam("id") Long id) {
		return userBean.delete(id);
	}
	
	@GET
	@Path("/login/{login}")
	public UserWrapper getUserByLogin(@PathParam("login") String login) {
		try {
			return userBean.getUserByLogin(login);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*@POST
	@Path("/login")
	public boolean login(UserWrapper user) {
		System.out.println("login");
	
		try {
			HttpSession session = request.getSession();
			
			request.authenticate(response);

			System.out.println(request.getUserPrincipal().getName());
			System.out.println( session.getId() );
			
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			
			return false;
		}
	}*/
	
	@GET
	@Path("/logout")
	public boolean logout() {
		System.out.println("logout");
	
		try {
			HttpSession session = request.getSession();
			System.out.println("before");
			System.out.println(request.getUserPrincipal().getName());
			System.out.println( session.getId() );
			
			request.logout();

			System.out.println("after");
			System.out.println(request.getUserPrincipal().getName());
			System.out.println( session.getId() );
			
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			
			return false;
		}
	}
}