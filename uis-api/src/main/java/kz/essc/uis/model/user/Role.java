package kz.essc.uis.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sc_role")
public class Role {

	private String name;
	private String conditional;
	private String enabled;
	
	@Id
	@Column(name="name_", nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="conditional_", nullable=false)
	public String getConditional() {
		return conditional;
	}
	public void setConditional(String conditional) {
		this.conditional = conditional;
	}
	
	@Column(name="enabled_", nullable=false)
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	
	
}
