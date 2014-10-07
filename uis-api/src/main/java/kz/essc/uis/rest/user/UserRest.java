package kz.essc.uis.rest.user;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import kz.essc.uis.bean.user.UserBean;
import kz.essc.uis.ejb.user.UserWrapper;

@Path("/users")
@Produces({ MediaType.APPLICATION_JSON})
@Consumes({ MediaType.APPLICATION_JSON})
public class UserRest {
	
	@Inject
	UserBean userBean;
	
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
	public UserWrapper edit(@PathParam("id") Long id, UserWrapper userWrapper) {
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
}