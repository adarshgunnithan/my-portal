/*
 * (C) Copyright 
 * Author :Adarsh , created on 14-Nov-2017
 * TagVO.java ,Represent a particular category in post
 *
 */

package com.adarsh.myportal.dao.jpa.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Adarsh
 *Represent a particular category in post
 */
@Table(name="blog_category")
@Entity
public class Tag implements Serializable{
	
private static final long serialVersionUID = 1L;

private Long tagId;
private String tagText;

@Column(name="tag_id")
public Long getTagId() {
	return tagId;
}
public void setTagId(Long tagId) {
	this.tagId = tagId;
}
@Column(name="tag_text")
public String getTagText() {
	return tagText;
}
public void setTagText(String tagText) {
	this.tagText = tagText;
}

}
