package kz.essc.uis.model.testing;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="qu_variant")
public class Variant {
	private long id;
	private String name;
	private boolean right;
	private Question question;
	
	@Id
	@Column(name="id_")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="name_", nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="right_", nullable=false)
	public boolean getRight() {
		return right;
	}
	public void setRight(boolean right) {
		this.right = right;
	}

	@ManyToOne
	@JoinColumn(name = "question_")
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
}
