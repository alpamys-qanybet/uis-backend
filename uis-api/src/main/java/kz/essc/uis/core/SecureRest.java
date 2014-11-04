package kz.essc.uis.core;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import kz.essc.uis.sc.user.Role;
import kz.essc.uis.user.UserWrapper;

@Path("/secure")
public class SecureRest {
	@Context
	HttpServletRequest request;
	
	@Context
	HttpServletResponse response;
	
	@Inject
	SecurityBean securityBean;
	
	@GET
	@Path("/")
	@Produces("text/plain")
	public String check() {
		return "Hello world";
	}
	
	@GET
	@Path("/service")
	/*public void service(@QueryParam("url") String url) throws IOException {
		response.sendRedirect(url); // "http://localhost/es/ui/app"
	}*/
	public String service() throws IOException {
		return "success";
	}
	
	@GET
	@Path("/roles")
	public List<RoleWrapper> getRoles() throws IOException {
		return RoleWrapper.wrap(securityBean.getRoles());
	}
	
	/*@GET
	@Path("/permissions")
	public List<PermissionWrapper> getPermissions() throws IOException {
		return userBean.getPermissions();
	}*/
}
