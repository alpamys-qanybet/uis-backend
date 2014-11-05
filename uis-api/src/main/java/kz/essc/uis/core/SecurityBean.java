package kz.essc.uis.core;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import kz.essc.uis.sc.user.Permission;
import kz.essc.uis.sc.user.Role;
import kz.essc.uis.sc.user.User;
import sun.misc.BASE64Encoder;

@Stateless
public class SecurityBean {

	@PersistenceContext
	EntityManager em;
	
	public String hash(String input) {
		// please note that we do not use digest, because if we
		// cannot get digest, then the second time we have to call it
		// again, which will fail again
		MessageDigest digest = null;
		
		try {
			digest = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (digest == null)
			return input;
		
		// now everything is ok, go ahead
		try {
			digest.update(input.getBytes("UTF-8"));
		} catch (java.io.UnsupportedEncodingException ex) {
			ex.printStackTrace();
		}
		byte[] rawData = digest.digest();
		BASE64Encoder bencoder = new BASE64Encoder();
		return bencoder.encode(rawData);
	}
	
	public boolean hasPermission(String login, Permission.Target target, Permission.Action action) {
//		INSERT INTO wx_permission(id_, action_, discriminator_, recipient_, target_)  VALUES (1, 'upload', 'user', '1', 'kz.bee.kudos.lms');
		
		try {
			User user = em.find(User.class, getIdByLogin(login));
			String roles = "";
			
			for ( Role r: user.getRoles() )
				if (r.isEnabled()) {
					if (!roles.isEmpty())
						roles += ",";
					roles += r.getName();
				}
			
			BigInteger count = (BigInteger) em.createNativeQuery(
							"SELECT COUNT (p) " +
			          		"FROM sc_permission p " +
			          		"WHERE ( (p.action_= :action) OR (p.action_ = '*')) " +
			          		"AND p.target_= :target " +
			          		"AND ((p.discriminator_='user' AND p.recipient_=:id) OR (p.discriminator_='role' AND p.recipient_ in (:roles)))")
			          		.setParameter("action", action.toString())
        		  			.setParameter("target", target.toString())
        		  			.setParameter("id", user.getId()+"")
        		  			.setParameter("roles", roles)
        		  			.getSingleResult();
          
			return (count != BigInteger.ZERO);
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean hasRole(String login, Role.Name role) {
		try {
			User user = em.find(User.class, getIdByLogin(login) );
			
			for ( Role r: user.getRoles() )
				if (r.getName().equals(role.toString()) && r.isEnabled())
					return true;
			
			return false;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public List<String> getRoles() {
		try {
			List<String> list = new ArrayList<String>();
			
			for (Role.Name role: Role.Name.values())
				list.add(role.toString());
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<String> getPermissions() {
		try {
			List<String> list = new ArrayList<String>();
			
			for (Permission.Target role: Permission.Target.values())
				list.add(role.toString());
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Role> getRoles(Long userId) {
		try {
			User user = em.find(User.class, userId);
			
			List<Role> roles = new ArrayList<Role>();
			
			for (Role role: user.getRoles())
				if (role.isEnabled()) {
					roles.add(role);
				}
			
			return roles;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean addRole(Long userId, RoleWrapper roleWrapper) {
		User user = em.find(User.class, userId);
		Role role = em.find(Role.class, roleWrapper.getName());
		
		if (!user.getRoles().contains(role)) {
			user.getRoles().add(role);
			em.merge(user);
		}
		
		return true;
	}
	
	public boolean removeRole(Long userId, String rolename) {
		User user = em.find(User.class, userId);
		Role role = em.find(Role.class, rolename);
		
		if (user.getRoles().contains(role)) {
			user.getRoles().remove(role);
			em.merge(user);
		}
		
		return true;
	}
	
	public List<Permission> getPermissions(Long userId) {
		try {
			User user = em.find(User.class, userId);
			
			String roles = "";
			
			for ( Role r: user.getRoles() )
				if (r.isEnabled()) {
					if (!roles.isEmpty())
						roles += ",";
					roles += r.getName();
				}
			
			return (List<Permission>) em.createQuery("from Permission " +
									          		"where ((discriminator='user' AND recipient=:id) OR (discriminator='role' AND recipient in (:roles)))")
			          		.setParameter("id", user.getId()+"")
        		  			.setParameter("roles", roles)
        		  			.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public long getIdByLogin(String login) {
		try {
			User user = (User) em.createQuery("from User where login = :login")
								.setParameter("login", login)
								.getSingleResult();
			
			return user.getId();
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
