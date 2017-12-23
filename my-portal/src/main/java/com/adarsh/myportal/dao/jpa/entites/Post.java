/*
 * (C) Copyright 
 * Author :Adarsh , created on 14-Nov-2017
 * Post.java , Object model represents a blog post
 *
 */

package com.adarsh.myportal.dao.jpa.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.adarsh.myportal.api.vo.PostStatusEnum;

/**
 * @author Adarsh 
 * Entity to represent a Blog Post
 */
@Entity
@Table(name="blog_post")
public class Post implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Long postId;
	private String title;
	private String description;
	private Date publishedDate;
	private PostStatusEnum postStatus;
	private List<Comment> comments;
	private User userVO;
	private List<Tag> tags;
	private String mainImagePath;
	
	@Id
	@GeneratedValue
	@Column(name="blog_post_postid")
	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}
	@Column(name="blog_post_title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name="blog_post_description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="blog_post_publisheddate")
	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

    @Enumerated(EnumType.STRING)
	@Column(name="blog_post_status")
	public PostStatusEnum getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(PostStatusEnum postStatus) {
		this.postStatus = postStatus;
	}
	@OneToMany
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public User getUserVO() {
		return userVO;
	}

	public void setUserVO(User userVO) {
		this.userVO = userVO;
	}
    @OneToMany
	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
   @Column(name="post_mainimage")
	public String getMainImagePath() {
		return mainImagePath;
	}

	public void setMainImagePath(String mainImagePath) {
		this.mainImagePath = mainImagePath;
	}

}
