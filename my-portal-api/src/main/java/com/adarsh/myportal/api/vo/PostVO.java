/*
 * (C) Copyright 
 * Author :Adarsh , created on 14-Nov-2017
 * Post.java , Object model represents a blog post
 *
 */

package com.adarsh.myportal.api.vo;

import java.util.Date;
import java.util.List;

import javax.swing.text.html.HTML.Tag;

/**
 * @author Adarsh
 *PostVO.java , Object model represents a blog post
 */
public class PostVO {
	
  private Long postId;
  private String title;
  //html?
  private String description;
  private Date publishedDate;
  private  PostStatusEnum postStatus;
  private List<CommentVO> comments;
  private UserVO userVO;
  private List<Tag> tags;
  //alternatives cms?
 
  private String mainImagePath;
  private  List<MultiMediaContent> multimediaContents;
  
public Long getPostId() {
	return postId;
}
public void setPostId(Long postId) {
	this.postId = postId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getPublishedDate() {
	return publishedDate;
}
public void setPublishedDate(Date publishedDate) {
	this.publishedDate = publishedDate;
}
public PostStatusEnum getPostStatus() {
	return postStatus;
}
public void setPostStatus(PostStatusEnum postStatus) {
	this.postStatus = postStatus;
}
public List<CommentVO> getComments() {
	return comments;
}
public void setComments(List<CommentVO> comments) {
	this.comments = comments;
}
public UserVO getUserVO() {
	return userVO;
}
public void setUserVO(UserVO userVO) {
	this.userVO = userVO;
}
public List<Tag> getTags() {
	return tags;
}
public void setTags(List<Tag> tags) {
	this.tags = tags;
}
  
}
