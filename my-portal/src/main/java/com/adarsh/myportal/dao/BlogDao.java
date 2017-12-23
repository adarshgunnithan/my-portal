/*
 * (C) Copyright 
 * Author :Adarsh , created on 19-Dec-2017
 * BlogDao.java ,
 *
 */

package com.adarsh.myportal.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.adarsh.myportal.dao.jpa.entites.Post;

public interface BlogDao {

	public boolean createPost(Post post);
	public List<Post> getAllPost();
}
