package model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Evaluation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private LocalDateTime startTime;
	
	@Column(nullable = false)
	private LocalDateTime endTime;
	
	@Column(nullable = false)
	private int numberOfPoints;
	
	@OneToOne
	@Column(nullable = false)
	private EvaluationType evaluationType; // Može li ovde string?
	
	@OneToOne
	@Column(nullable = false)
	private EvaluationInstrument evaluationInstrument;
	
	@OneToOne
	@Column(nullable = false)
	private Examination examination;

	public Evaluation() {
		super();
	}

	public Evaluation(Long id, LocalDateTime startTime, LocalDateTime endTime, int numberOfPoints,
			EvaluationType evaluationType, EvaluationInstrument evaluationInstrument, Examination examination) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.numberOfPoints = numberOfPoints;
		this.evaluationType = evaluationType;
		this.evaluationInstrument = evaluationInstrument;
		this.examination = examination;
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

	public int getNumberOfPoints() {
		return numberOfPoints;
	}

	public void setNumberOfPoints(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}

	public EvaluationType getEvaluationType() {
		return evaluationType;
	}

	public void setEvaluationType(EvaluationType evaluationType) {
		this.evaluationType = evaluationType;
	}

	public EvaluationInstrument getEvaluationInstrument() {
		return evaluationInstrument;
	}

	public void setEvaluationInstrument(EvaluationInstrument evaluationInstrument) {
		this.evaluationInstrument = evaluationInstrument;
	}

	public Examination getExamination() {
		return examination;
	}

	public void setExamination(Examination examination) {
		this.examination = examination;
	}
	
	
}
