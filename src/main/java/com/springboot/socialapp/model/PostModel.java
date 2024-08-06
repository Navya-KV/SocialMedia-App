package com.springboot.socialapp.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "post_details")
public class PostModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
	private Long postId; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private UserModel user;
	
	@Column(name = "image_url",nullable = false)
	private String postImage;
	
	@Column(name = "caption")
	private String postCaption;
	
	@Column(name = "created_at",nullable = false,updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt = new Date();

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public String getPostImage() {
		return postImage;
	}

	public void setPostImage(String postImage) {
		this.postImage = postImage;
	}

	public String getPostCaption() {
		return postCaption;
	}

	public void setPostCaption(String postCaption) {
		this.postCaption = postCaption;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "PostModel [postId=" + postId + ", user=" + user + ", postImage=" + postImage + ", postCaption="
				+ postCaption + ", createdAt=" + createdAt + "]";
	}

	public PostModel(Long postId, UserModel user, String postImage, String postCaption, Date createdAt) {
		this.postId = postId;
		this.user = user;
		this.postImage = postImage;
		this.postCaption = postCaption;
		this.createdAt = createdAt;
	}

	public PostModel() {
		
	}
	
	
}
