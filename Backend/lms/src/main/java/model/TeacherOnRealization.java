package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TeacherOnRealization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private int numberOfClasses;
	
	@OneToOne
	@Column(nullable = false)
	private Teacher teacher;
	
	@OneToOne
	@Column(nullable = false)
	private SubjectRealization subjectRealization;
	
	@OneToOne
	@Column(nullable = false)
	private Notification notification;
	
	@OneToOne
	@Column(nullable = false)
	private TeachingType teachingType;

	public TeacherOnRealization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherOnRealization(Long id, int numberOfClasses, Teacher teacher, SubjectRealization subjectRealization,
			Notification notification, TeachingType teachingType) {
		super();
		this.id = id;
		this.numberOfClasses = numberOfClasses;
		this.teacher = teacher;
		this.subjectRealization = subjectRealization;
		this.notification = notification;
		this.teachingType = teachingType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public SubjectRealization getSubjectRealization() {
		return subjectRealization;
	}

	public void setSubjectRealization(SubjectRealization subjectRealization) {
		this.subjectRealization = subjectRealization;
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	public TeachingType getTeachingType() {
		return teachingType;
	}

	public void setTeachingType(TeachingType teachingType) {
		this.teachingType = teachingType;
	}
	
	
}
