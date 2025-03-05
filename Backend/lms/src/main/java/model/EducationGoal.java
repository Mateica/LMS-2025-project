package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class EducationGoal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	@Column(nullable = false)
	private String description;
	
	@OneToOne
	@Column(nullable = true)
	private Aftermath aftermath;

	public EducationGoal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EducationGoal(Long id, String description, Aftermath aftermath) {
		super();
		this.id = id;
		this.description = description;
		this.aftermath = aftermath;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Aftermath getAftermath() {
		return aftermath;
	}

	public void setAftermath(Aftermath aftermath) {
		this.aftermath = aftermath;
	}
	
	
	
}
