package kz.essc.uis.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import kz.essc.uis.model.SimpleProperty;

public class RepositoryManager {

	@Inject
	private EntityManager em;
	
	public List<SimpleProperty> queryCache() {
		Query query = em.createQuery("from SimpleProperty");
		
		List <SimpleProperty> list = query.getResultList();
		
		return list;
	}
}
