package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Topic {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = true)
	@ManyToOne
	private ForumUser author;
	
	@OneToMany(mappedBy = "topic")
	@Column(nullable = false)
	private List<Announcement> announcements = new ArrayList<Announcement>();
	
	@ManyToOne
	@Column(nullable = false)
	private Forum forum;

	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Topic(Long id, String name, ForumUser author, Forum forum) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.announcements = new ArrayList<Announcement>();
		this.forum = forum;
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

	public ForumUser getAuthor() {
		return author;
	}

	public void setAuthor(ForumUser author) {
		this.author = author;
	}

	public List<Announcement> getAnnouncements() {
		return announcements;
	}

	public void setAnnouncements(List<Announcement> announcements) {
		this.announcements = announcements;
	}

	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}
	
	
	
	
	
}
