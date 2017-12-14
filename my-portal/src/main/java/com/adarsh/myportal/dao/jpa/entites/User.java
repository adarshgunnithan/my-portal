/*
 * (C) Copyright 
 * Author :Adarsh , created on 14-Nov-2017
 * UserVO.java ,
 *
 */

package com.adarsh.myportal.dao.jpa.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Needs to enhanced 
 * @author Adarsh
  *User entity
 */
@Table(name="user_main")
@Entity
public class User implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private String userUId;
	
	@Column(name="user_id")
	public String getUserUId() {
		return userUId;
	}

	public void setUserUId(String userUId) {
		this.userUId = userUId;
	}
}
