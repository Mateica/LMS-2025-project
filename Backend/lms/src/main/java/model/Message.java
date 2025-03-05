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
import javax.persistence.OneToOne;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private LocalDateTime timePublished;
	
	@OneToOne
	private RegisteredUser sender;
	
	@OneToOne
	private RegisteredUser receiver;
	
	@OneToMany(mappedBy = "message")
	private List<File> attachments = new ArrayList<File>();

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(Long id, LocalDateTime timePublished, RegisteredUser sender, RegisteredUser receiver) {
		super();
		this.id = id;
		this.timePublished = timePublished;
		this.sender = sender;
		this.receiver = receiver;
		this.attachments = new ArrayList<File>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getTimePublished() {
		return timePublished;
	}

	public void setTimePublished(LocalDateTime timePublished) {
		this.timePublished = timePublished;
	}

	public RegisteredUser getSender() {
		return sender;
	}

	public void setSender(RegisteredUser sender) {
		this.sender = sender;
	}

	public RegisteredUser getReceiver() {
		return receiver;
	}

	public void setReceiver(RegisteredUser receiver) {
		this.receiver = receiver;
	}

	public List<File> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<File> attachments) {
		this.attachments = attachments;
	}
	
	
	
	
}
