package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private int ects;
	
	@Column(nullable = false)
	private boolean compulsory;
	
	@Column(nullable = false)
	private int numberOfClasses;
	
	@Column(nullable = false)
	private int numberOfPractices;
	
	@Column(nullable = false)
	private int otherTypesOfClasses;
	
	@Column(nullable = false)
	private int researchWork;
	
	@Column(nullable = false)
	private int classesLeft;

	@Column(nullable = false)
	private int numberOfSemesters; // Da li ovo ima smisla?
	
	@ManyToOne
	@Column(nullable = false)
	private YearOfStudy yearOfStudy;
	
	@OneToOne
	@Column(nullable = false)
	private Aftermath aftermath;
	
	@OneToOne // Mozda 1 : *?
	@Column(nullable = true)
	private Subject prerequisite;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(Long id, String name, int ects, boolean compulsory, int numberOfClasses, int numberOfPractices,
			int otherTypesOfClasses, int researchWork, int classesLeft, int numberOfSemesters, YearOfStudy yearOfStudy,
			Aftermath aftermath) {
		super();
		this.id = id;
		this.name = name;
		this.ects = ects;
		this.compulsory = compulsory;
		this.numberOfClasses = numberOfClasses;
		this.numberOfPractices = numberOfPractices;
		this.otherTypesOfClasses = otherTypesOfClasses;
		this.researchWork = researchWork;
		this.classesLeft = classesLeft;
		this.numberOfSemesters = numberOfSemesters;
		this.yearOfStudy = yearOfStudy;
		this.aftermath = aftermath;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEcts() {
		return ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}

	public boolean isCompulsory() {
		return compulsory;
	}

	public void setCompulsory(boolean compulsory) {
		this.compulsory = compulsory;
	}

	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}

	public int getNumberOfPractices() {
		return numberOfPractices;
	}

	public void setNumberOfPractices(int numberOfPractices) {
		this.numberOfPractices = numberOfPractices;
	}

	public int getOtherTypesOfClasses() {
		return otherTypesOfClasses;
	}

	public void setOtherTypesOfClasses(int otherTypesOfClasses) {
		this.otherTypesOfClasses = otherTypesOfClasses;
	}

	public int getResearchWork() {
		return researchWork;
	}

	public void setResearchWork(int researchWork) {
		this.researchWork = researchWork;
	}

	public int getClassesLeft() {
		return classesLeft;
	}

	public void setClassesLeft(int classesLeft) {
		this.classesLeft = classesLeft;
	}

	public int getNumberOfSemesters() {
		return numberOfSemesters;
	}

	public void setNumberOfSemesters(int numberOfSemesters) {
		this.numberOfSemesters = numberOfSemesters;
	}

	public YearOfStudy getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(YearOfStudy yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public Aftermath getAftermath() {
		return aftermath;
	}

	public void setAftermath(Aftermath aftermath) {
		this.aftermath = aftermath;
	}

	public Subject getPrerequisite() {
		return prerequisite;
	}

	public void setPrerequisite(Subject prerequisite) {
		this.prerequisite = prerequisite;
	}
	
	
}
