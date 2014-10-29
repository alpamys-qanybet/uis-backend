package kz.essc.uis.core;

import javax.ejb.Stateless;

@Stateless
public class PermissionBean {
//	INSERT INTO wx_permission(id_, action_, discriminator_, recipient_, target_)  VALUES (1, 'upload', 'user', '1', 'kz.bee.kudos.lms');

	public enum Action {
		write,
		read
	}
	
	public enum Discriminator {
		user,
		role
	}
	
	public enum Target {
		UserManagement
	}
}