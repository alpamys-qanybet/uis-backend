package kz.essc.uis.user;

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

import kz.essc.uis.core.PermissionWrapper;
import kz.essc.uis.core.RoleWrapper;
import kz.essc.uis.core.SecurityBean;
import kz.essc.uis.sc.user.Permission;
import kz.essc.uis.sc.user.Role;


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
	public List<UserWrapper> get() {
		return userBean.get();
	}
	
	@GET
	@Path("/{id}")
	public UserWrapper get(@PathParam("id") Long id) {
		return userBean.get(id);
	}
	
	@POST
	@Path("/")
	public UserWrapper add(UserWrapper userWrapper) throws IOException {
		if (securityBean.hasRole(request.getUserPrincipal().getName(), Role.Name.dean)) {
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
		if (securityBean.hasRole(request.getUserPrincipal().getName(), Role.Name.dean)) {
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
		if (securityBean.hasPermission(request.getUserPrincipal().getName(), Permission.Target.UserManagement, Permission.Action.write)) {
				return userBean.delete(id);
		}
		else {
			response.sendError(HttpServletResponse.SC_PRECONDITION_FAILED);
			return -3;
		}
	}
	
	
	@GET
	@Path("/current")
	public UserWrapper getCurrent() {
		return userBean.getUserByLogin(request.getUserPrincipal().getName());
	}
	
	@GET
	@Path("/login/{login}")
	public UserWrapper getUserByLogin(@PathParam("login") String login) {
		return userBean.getUserByLogin(login);
	}
	
	@PUT
	@Path("/password/change")
	public boolean changePassword(UserWrapper userWrapper) throws IOException {
		Long id = securityBean.getIdByLogin(request.getUserPrincipal().getName());
		return userBean.changePassword(id, userWrapper);
	}
	
	@GET
	@Path("/{id}/password/reset")
	public int resetPassword(@PathParam("id") Long id) throws IOException {
		if (securityBean.hasPermission(request.getUserPrincipal().getName(), Permission.Target.UserManagement, Permission.Action.write)) {
			return userBean.resetPassword(id);
		}
		else {
			response.sendError(HttpServletResponse.SC_PRECONDITION_FAILED);
			return -3;
		}
	}
	
	@GET
	@Path("/roles")
	public List<RoleWrapper> getRoles() throws IOException {
		return userBean.getRoles(request.getUserPrincipal().getName());
	}
	
	@GET
	@Path("/permissions")
	public List<PermissionWrapper> getPermissions() throws IOException {
		return userBean.getPermissions(request.getUserPrincipal().getName());
	}
	
	@GET
	@Path("/logout")
	public boolean logout() {
		try {
			request.logout();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}