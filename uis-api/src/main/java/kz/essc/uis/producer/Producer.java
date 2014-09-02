package kz.essc.uis.producer;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import kz.essc.uis.model.SimpleProperty;
import kz.essc.uis.repository.RepositoryManager;

@RequestScoped
public class Producer {
	@Inject 
	RepositoryManager db;
	
	private List<SimpleProperty> propertyList;
	
	public void onMemberListChanged(@Observes(notifyObserver = Reception.IF_EXISTS) final SimpleProperty member) {
		retrieveAllSeatsOrderedByName();
	}

	@Produces
	@Named
	public List<SimpleProperty> getPropertyList() {
		return propertyList;
	}

	public void setPropertyList(List<SimpleProperty> propertyList) {
		this.propertyList = propertyList;
	}
	
	@PostConstruct
	public void retrieveAllSeatsOrderedByName() {
		propertyList = db.queryCache();
	}
}
