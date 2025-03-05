package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Title {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date dateElected;
	
	@Column(nullable = false)
	private Date dateAbolished;
	
	@Column(nullable = false)
	@OneToOne
	private ScientificField scientificField;
	
	@Column(nullable = false)
	@OneToOne
	private TitleType titleType; // Moze li ovde stajati samo string?

	public Title() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Title(Long id, Date dateElected, Date dateAbolished, ScientificField scientificField, TitleType titleType) {
		super();
		this.id = id;
		this.dateElected = dateElected;
		this.dateAbolished = dateAbolished;
		this.scientificField = scientificField;
		this.titleType = titleType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateElected() {
		return dateElected;
	}

	public void setDateElected(Date dateElected) {
		this.dateElected = dateElected;
	}

	public Date getDateAbolished() {
		return dateAbolished;
	}

	public void setDateAbolished(Date dateAbolished) {
		this.dateAbolished = dateAbolished;
	}

	public ScientificField getScientificField() {
		return scientificField;
	}

	public void setScientificField(ScientificField scientificField) {
		this.scientificField = scientificField;
	}

	public TitleType getTitleType() {
		return titleType;
	}

	public void setTitleType(TitleType titleType) {
		this.titleType = titleType;
	}
	
	
}
