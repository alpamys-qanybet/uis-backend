package kz.essc.uis.bean.user;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import kz.essc.uis.bean.core.SecurityBean;
import kz.essc.uis.ejb.user.UserWrapper;
import kz.essc.uis.sc.user.User;

@Stateless
public class UserBean {
	@PersistenceContext
	EntityManager em;

	@Inject
	SecurityBean securityBean;
	
	public UserWrapper get(Long id) {
		try {
			return wrap( (User) em.find(User.class, id) );
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public UserWrapper getUserByLogin(String login) {
		try {
			User user = (User) em.createQuery("from User where login = :login")
								.setParameter("login", login)
								.getSingleResult();
			
			return wrap( user );
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<UserWrapper> getUsers() {
		
		try {
			List<User> list = (ArrayList<User>) em.createQuery("from User")
												  .getResultList();
			return wrap(list);
		}
		catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<UserWrapper>();
		}
	}
	
	public UserWrapper add(UserWrapper userWrapper) {
		try {
			User user = new User();
			user.setLogin(userWrapper.getLogin());
			user.setName(userWrapper.getName());
			user.setPassword( securityBean.hash(userWrapper.getLogin()) );
			
			em.persist(user);
			
			em.createNativeQuery("INSERT INTO sc_jaas_role(group_, name_, user_) " +
								 "VALUES ('Roles', 'authenticated', :login);")
				.setParameter("login", user.getLogin())
				.executeUpdate();
			
			return wrap(user);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public UserWrapper edit(Long id, UserWrapper userWrapper) {
		System.out.println("edit");
		
		try {
			System.out.println("id " + id);
//			System.out.println("login " + userWrapper.getLogin());
			System.out.println("name " + userWrapper.getName());
//			System.out.println("password " + userWrapper.getPassword());
			
			User user = (User) em.find(User.class, id);
//			user.setLogin(userWrapper.getLogin());
			user.setName(userWrapper.getName());
//			user.setPassword(userWrapper.getPassword());
			
			em.merge(user);
			
			return wrap(user);
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
	
	public UserWrapper wrap(User user){
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
	
	public List<UserWrapper> wrap(List<User> users){
		List<UserWrapper> list = new ArrayList<UserWrapper>();
		for (User user: users) 
			list.add(wrap(user));
		
		return list;
	}
}
