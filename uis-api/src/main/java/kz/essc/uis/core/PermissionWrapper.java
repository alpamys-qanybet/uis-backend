package kz.essc.uis.core;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import kz.essc.uis.sc.user.Permission;

@Stateless
public class PermissionWrapper {
	private long id;
	private String action;
	private String discriminator;
	private String recipient;
	private String target;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	public String getDiscriminator() {
		return discriminator;
	}
	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}
	
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	
	public static PermissionWrapper wrap(Permission permission){
		try {
			PermissionWrapper wrapper = new PermissionWrapper();
			wrapper.setId(permission.getId());
			wrapper.setAction(permission.getAction());
			wrapper.setDiscriminator(permission.getDiscriminator());
			wrapper.setRecipient(permission.getRecipient());
			wrapper.setTarget(permission.getTarget());
			return wrapper;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static List<PermissionWrapper> wrap(List<Permission> permissions){
		List<PermissionWrapper> list = new ArrayList<PermissionWrapper>();
		for (Permission permission: permissions) 
			list.add(wrap(permission));
		
		return list;
	}
}