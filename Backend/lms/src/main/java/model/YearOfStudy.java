package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class YearOfStudy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private LocalDateTime yearOfStudy;
	
	@OneToMany(mappedBy = "year_of_study")
	@Column(nullable = false)
	private List<Subject> subjects = new ArrayList<Subject>();

	public YearOfStudy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public YearOfStudy(Long id, LocalDateTime yearOfStudy) {
		super();
		this.id = id;
		this.yearOfStudy = yearOfStudy;
		this.subjects = new ArrayList<Subject>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(LocalDateTime yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	
	
	
}
