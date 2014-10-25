package kz.essc.uis.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class CoreRest {

	@GET
	@Path("/")
	@Produces("text/plain")
	public String check() {
		return "Hello world";
	}
}