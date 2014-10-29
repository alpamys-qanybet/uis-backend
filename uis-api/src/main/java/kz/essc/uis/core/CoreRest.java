package kz.essc.uis.core;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

@Path("/")
public class CoreRest {
	@Context
	HttpServletRequest request;
	
	@GET
	@Path("/")
	@Produces("text/plain")
	public String check() {
		return "Hello world";
	}
	
	@GET
	@Path("/authorized")
	@Produces("text/plain")
	public boolean authorized() {
		return request.getUserPrincipal() != null;
	}
}