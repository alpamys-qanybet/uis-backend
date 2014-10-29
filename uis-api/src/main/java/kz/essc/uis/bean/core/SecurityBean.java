package kz.essc.uis.bean.core;

import java.math.BigInteger;
import java.security.MessageDigest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import kz.essc.uis.bean.user.UserBean;
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
	
	/*public boolean hasPermission(String username, String target, String action){
		try {
			User user = em.find(User.class, username);
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
			          		"WHERE ( (p.action_= :action) OR (p.action_ = '*'))  " +
			          		"AND p.target_= :target " +
			          		"AND ((discriminator_='user' AND p.recipient_=:username) OR (discriminator_='role' AND p.recipient_ in (:roles)))")
			          		.setParameter("action", action)
        		  			.setParameter("target", target)
        		  			.setParameter("username", username)
        		  			.setParameter("roles", roles)
        		  			.getSingleResult();
          
			return (count != BigInteger.ZERO);
		}
		finally {
			if (em!=null)
				em.close();
		}		
	}*/
	
	public boolean hasRole(String login, String role) {
		try {
			User user = em.find(User.class, getIdByLogin(login) );
			
			for ( Role r: user.getRoles() )
				if (r.getName().equals(role) && r.isEnabled())
					return true;
			
			return false;
		}
		catch (Exception e) {
			return false;
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
