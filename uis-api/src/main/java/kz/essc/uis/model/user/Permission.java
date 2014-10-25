package kz.essc.uis.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sc_permission")
public class Permission {
	private long id;
	private String action;
	private String recipient;
	private String target;

	@Id
	@Column(name="id_")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="action_", nullable=false)
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	@Column(name="recipient_", nullable=false)
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	@Column(name="target_", nullable=false)
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
}
