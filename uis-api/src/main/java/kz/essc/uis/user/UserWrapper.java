package kz.essc.uis.user;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import kz.essc.uis.sc.user.User;

@Stateless
public class UserWrapper {

	private long id;
	private String login;
	private String name;
	private String password;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static UserWrapper wrap(User user){
		try {
			UserWrapper wrapper = new UserWrapper();
			wrapper.setId(user.getId());
			wrapper.setLogin(user.getLogin());
			wrapper.setName(user.getName());
			wrapper.setPassword(user.getPassword());
			return wrapper;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static List<UserWrapper> wrap(List<User> users){
		List<UserWrapper> list = new ArrayList<UserWrapper>();
		for (User user: users) 
			list.add(wrap(user));
		
		return list;
	}
}
