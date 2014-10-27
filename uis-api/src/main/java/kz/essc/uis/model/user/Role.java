package kz.essc.uis.model.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sc_role")
public class Role implements Serializable {
	
	private static final long serialVersionUID = -5360799851217675397L;
	
	private String name;
	private boolean conditional;
	private boolean enabled;
	
	@Id
	@Column(name="name_", nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="conditional_")
	public boolean isConditional() {
		return conditional;
	}
	public void setConditional(boolean conditional) {
		this.conditional = conditional;
	}
	
	@Column(name="enabled_")
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
}
