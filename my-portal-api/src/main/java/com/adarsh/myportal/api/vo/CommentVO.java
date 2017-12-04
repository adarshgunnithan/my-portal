/*
 * (C) Copyright 
 * Author :Adarsh , created on 14-Nov-2017
 * Comments.java , view object for respresenting post comments
 *
 */

package com.adarsh.myportal.api.vo;

import java.util.Date;
import java.util.List;

/**
 * @author Adarsh
 * holds comment object
 */
public class CommentVO {
	
	private UserVO user;
	private Long commentId;
	private String commentText;
	private List<CommentVO> replyComments;
	private Date date;
	
	public UserVO getUser() {
		return user;
	}
	public void setUser(UserVO user) {
		this.user = user;
	}
	public Long getCommentId() {
		return commentId;
	}
	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public List<CommentVO> getReplyComments() {
		return replyComments;
	}
	public void setReplyComments(List<CommentVO> replyComments) {
		this.replyComments = replyComments;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
