package com.springboot.socialapp.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "user_details")
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;

	@Column(name = "username", unique = true, nullable = false)
	private String userName;

	@Column(name = "user_email", unique = true, nullable = false)
	private String userEmail;

	@Column(name = "password", nullable = false)
	private String userPassword;

	@Column(name = "created_at", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createdAt = new java.util.Date();

	@Column(name = "profile_pic")
	private String profilePic;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<PostModel> post_details;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public Set<PostModel> getPost_details() {
		return post_details;
	}

	public void setPost_details(Set<PostModel> post_details) {
		this.post_details = post_details;
	}

	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", createdAt=" + createdAt + ", profilePic=" + profilePic + ", post_details="
				+ post_details + "]";
	}

	public UserModel(Long userId, String userName, String userEmail, String userPassword, Date createdAt,
			String profilePic, Set<PostModel> post_details) {

		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.createdAt = createdAt;
		this.profilePic = profilePic;
		this.post_details = post_details;
	}

	public UserModel() {

	}

}
