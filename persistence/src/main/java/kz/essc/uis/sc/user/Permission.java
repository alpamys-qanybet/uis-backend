package kz.essc.uis.sc.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sc_permission")
public class Permission implements Serializable {
	private static final long serialVersionUID = -8204677389298340306L;
	private long id;
	private String action;
	private String discriminator;
	private String recipient;
	private String target;

//	INSERT INTO wx_permission(id_, action_, discriminator_, recipient_, target_)  VALUES (1, 'upload', 'user', '1', 'kz.bee.kudos.lms');

	public enum Action {
		write,
		read
	}
	
	public enum Discriminator {
		user,
		role
	}
	
	public enum Target {
		UserManagement
	}
	
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
	
	@Column(name="discriminator_", nullable=false)
	public String getDiscriminator() {
		return discriminator;
	}
	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
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
