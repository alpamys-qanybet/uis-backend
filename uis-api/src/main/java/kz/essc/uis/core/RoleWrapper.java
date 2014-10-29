package kz.essc.uis.core;

import java.util.ArrayList;
import java.util.List;

import kz.essc.uis.sc.user.Role;

public class RoleWrapper {
	private String name;
	private boolean conditional;
	private boolean enabled;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isConditional() {
		return conditional;
	}
	public void setConditional(boolean conditional) {
		this.conditional = conditional;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public static RoleWrapper wrap(Role role){
		try {
			RoleWrapper wrapper = new RoleWrapper();
			wrapper.setName(role.getName());
			wrapper.setConditional(role.isConditional());
			wrapper.setEnabled(role.isEnabled());
			return wrapper;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static List<RoleWrapper> wrap(List<Role> roles){
		List<RoleWrapper> list = new ArrayList<RoleWrapper>();
		for (Role role: roles) 
			list.add(wrap(role));
		
		return list;
	}
}