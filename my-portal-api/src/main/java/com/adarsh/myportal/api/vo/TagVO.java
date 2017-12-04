/*
 * (C) Copyright 
 * Author :Adarsh , created on 14-Nov-2017
 * TagVO.java ,Represent a particular category in post
 *
 */

package com.adarsh.myportal.api.vo;

/**
 * @author Adarsh
 *Represent a particular category in post
 */
public class TagVO {
	
private Long tagId;
private String tagText;

public Long getTagId() {
	return tagId;
}
public void setTagId(Long tagId) {
	this.tagId = tagId;
}
public String getTagText() {
	return tagText;
}
public void setTagText(String tagText) {
	this.tagText = tagText;
}

}
