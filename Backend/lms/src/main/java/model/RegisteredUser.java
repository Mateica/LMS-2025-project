package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class RegisteredUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	@Column(nullable = false)
	private String username;
	
	@Lob
	@Column(nullable = false)
	private String password;
	
	@Lob
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	@OneToMany(mappedBy = "registered_user")
	private List<ForumUser> forumUser = new ArrayList<ForumUser>();
	
	public RegisteredUser() {}
	
	public RegisteredUser(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.forumUser = new ArrayList<ForumUser>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<ForumUser> getForumUser() {
		return forumUser;
	}

	public void setForumUser(List<ForumUser> forumUser) {
		this.forumUser = forumUser;
	}
	
	
	
	
	
}
