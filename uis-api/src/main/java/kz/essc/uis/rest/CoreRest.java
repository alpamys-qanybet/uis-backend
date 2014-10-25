package kz.essc.uis.rest;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

@Path("/")
public class CoreRest {

	@Context
	HttpServletResponse response;
	
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
}
