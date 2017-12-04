/*
 * (C) Copyright 
 * Author :Adarsh , created on 15-Nov-2017
 * PostSearchRequestVO.java ,
 *
 */

package com.adarsh.myportal.api.vo;

import java.util.Date;
import java.util.List;

/**
 * @author Adarsh
 *Search request vo  to search blog posts
 */
public class PostSearchVO {
	
private String searchText;
private Date fromDate;
private Date toDate;
private List<TagVO> tags;

public String getSearchText() {
	return searchText;
}
public void setSearchText(String searchText) {
	this.searchText = searchText;
}
public Date getFromDate() {
	return fromDate;
}
public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}
public Date getToDate() {
	return toDate;
}
public void setToDate(Date toDate) {
	this.toDate = toDate;
}
public List<TagVO> getTags() {
	return tags;
}
public void setTags(List<TagVO> tags) {
	this.tags = tags;
}

}
