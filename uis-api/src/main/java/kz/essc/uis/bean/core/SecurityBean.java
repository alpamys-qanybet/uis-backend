package kz.essc.uis.bean.core;

import java.math.BigInteger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import kz.essc.uis.model.user.Role;
import kz.essc.uis.model.user.User;

@Stateless
public class SecurityBean {

	@PersistenceContext
	EntityManager em;
	
	public boolean hasPermission(String username, String target, String action){
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
	}
	
	public boolean hasRole(String username, String role) {
		try {
			User user = em.find(User.class, username);
			
			for ( Role r: user.getRoles() )
				if (r.getName().equals(role) && r.isEnabled())
					return true;
			
			return false;
		}
		catch (Exception e) {
			return false;
		}
	}
}
