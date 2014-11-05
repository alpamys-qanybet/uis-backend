package kz.essc.uis.user;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import kz.essc.uis.core.PasswordManager;
import kz.essc.uis.core.SecurityBean;
import kz.essc.uis.queue.mail.MailMessageProducer;
import kz.essc.uis.sc.user.User;

@Stateless
public class UserBean {
	@PersistenceContext
	EntityManager em;

	@Inject
	SecurityBean securityBean;
	
	@Inject
	PasswordManager passwordManager;
	
	@Inject
	MailMessageProducer mailMessageProducer;
	
	public List<User> get() {
		
		try {
			return (ArrayList<User>) em.createQuery("from User")
										.getResultList();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public User get(Long id) {
		try {
			return (User) em.find(User.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public User add(UserWrapper userWrapper) {
		try {
			User user = new User();
			user.setLogin(userWrapper.getLogin());
			user.setName(userWrapper.getName());
			
			String password = passwordManager.generate();
			user.setPassword( securityBean.hash(password) );
			
			em.persist(user);
			
			em.createNativeQuery("INSERT INTO sc_jaas_role(group_, name_, user_) " +
								 "VALUES ('Roles', 'authenticated', :login);")
				.setParameter("login", user.getLogin())
				.executeUpdate();
			
			String toAddress = "alpamys.kanibetov@gmail.com";
			String subject = "SDU University Portal. New user.";
			StringBuilder content = new StringBuilder("");
			content.append("<h2>Admin! Notification</h2>");
			content.append("<p>New user has been added to university portal</p>");
			content.append("<p>Login: " + user.getLogin() + "</p>");
			content.append("<p>Password: " + password + "</p><br/>");
			content.append("Please, notify him/her to login, change password.");
			
			mailMessageProducer.send(toAddress, subject, content.toString());
			
			return user;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public User edit(Long id, UserWrapper userWrapper) {
		try {
			
			User user = (User) em.find(User.class, id);
			user.setName(userWrapper.getName());
			
			em.merge(user);
			
			return user;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int delete(Long id) {
		try {
			User user = (User) em.find(User.class, id);
			em.createNativeQuery("DELETE FROM sc_jaas_role " +
								 "WHERE user_ = '" + user.getLogin() + "';")
				.executeUpdate();
			
			em.remove(user);
			
			return 0;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public User getUserByLogin(String login) {
		try {
			return (User) em.createQuery("from User where login = :login")
							.setParameter("login", login)
							.getSingleResult();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean changePassword(Long id, UserWrapper userWrapper) {
		try {
			User user = (User) em.find(User.class, id);
			
			if (user.getPassword().equals( securityBean.hash(userWrapper.getOld()) )) {
				user.setPassword( securityBean.hash(userWrapper.getPassword()));
				em.merge(user);
			
				return true;
			}
			
			return false;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public int resetPassword(Long id) {
		try {
			User user = (User) em.find(User.class, id);
			
			String password = passwordManager.generate();
			user.setPassword( securityBean.hash(password) );
			
			em.merge(user);
			
			String toAddress = "alpamys.kanibetov@gmail.com";
			String subject = "SDU University Portal. Reset password.";
			StringBuilder content = new StringBuilder("");
			content.append("<h2>Admin! Notification</h2>");
			content.append("<p>User password was reset</p>");
			content.append("<p>Login: " + user.getLogin() + "</p>");
			content.append("<p>Password: " + password + "</p><br/>");
			content.append("Please, notify him/her to login, change password.");
			
			mailMessageProducer.send(toAddress, subject, content.toString());
			
			return 0;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
