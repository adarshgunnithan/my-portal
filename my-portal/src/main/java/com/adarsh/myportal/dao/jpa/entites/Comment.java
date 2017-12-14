/*
 * (C) Copyright 
 * Author :Adarsh , created on 14-Nov-2017
 * Comments.java , view object for respresenting post comments
 *
 */

package com.adarsh.myportal.dao.jpa.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Adarsh 
 * Blog Comment entity 
 */
@Entity
@Table(name = "blog_comments")
public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;

	private User user;
	private Long commentId;
	private String commentText;
	private List<Comment> replyComments;
	private Date date;

	@OneToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Id
	@GeneratedValue
	@Column(name = "comment_id")
	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	@Column(name = "comment_text")
	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	@OneToMany
	public List<Comment> getReplyComments() {
		return replyComments;
	}

	public void setReplyComments(List<Comment> replyComments) {
		this.replyComments = replyComments;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "comment_date")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
