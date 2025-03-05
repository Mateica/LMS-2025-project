package model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ClassTime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private LocalDateTime startTime;
	
	@Column(nullable = false)
	private LocalDateTime endTime;
	
	@OneToOne
	@Column(nullable = false)
	private Aftermath aftermath;
	
	@OneToOne
	@Column(nullable = false)
	private ClassType classType;
	
	@OneToOne
	@Column(nullable = false)
	private SubjectRealization subjectRealization;
	
	public ClassTime() {}

	public ClassTime(LocalDateTime startTime, LocalDateTime endTime, Aftermath aftermath, ClassType classType,
			SubjectRealization subjectRealization) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.aftermath = aftermath;
		this.classType = classType;
		this.subjectRealization = subjectRealization;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public Aftermath getAftermath() {
		return aftermath;
	}

	public void setAftermath(Aftermath aftermath) {
		this.aftermath = aftermath;
	}

	public ClassType getClassType() {
		return classType;
	}

	public void setClassType(ClassType classType) {
		this.classType = classType;
	}

	public SubjectRealization getSubjectRealization() {
		return subjectRealization;
	}

	public void setSubjectRealization(SubjectRealization subjectRealization) {
		this.subjectRealization = subjectRealization;
	}
	
	
	
}
