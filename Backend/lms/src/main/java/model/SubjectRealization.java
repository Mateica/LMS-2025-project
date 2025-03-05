package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SubjectRealization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@Column(nullable = false)
	private Evaluation evaluation;
	
	@OneToOne
	@Column(nullable = false)
	private TeacherOnRealization teacherOnRealization;
	
	@OneToOne
	@Column(nullable = false)
	private Subject subject;

	public SubjectRealization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubjectRealization(Long id, Evaluation evaluation, TeacherOnRealization teacherOnRealization,
			Subject subject) {
		super();
		this.id = id;
		this.evaluation = evaluation;
		this.teacherOnRealization = teacherOnRealization;
		this.subject = subject;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public TeacherOnRealization getTeacherOnRealization() {
		return teacherOnRealization;
	}

	public void setTeacherOnRealization(TeacherOnRealization teacherOnRealization) {
		this.teacherOnRealization = teacherOnRealization;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
}
