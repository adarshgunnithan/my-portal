/*
 * (C) Copyright 
 * Author :Adarsh , created on 19-Dec-2017
 * BlogDao.java ,
 *
 */

package com.adarsh.myportal.dao;

import java.util.List;
import com.adarsh.myportal.dao.jpa.entites.Post;

/**
 * @author Adarsh
 * Blog Dao
 */
public interface BlogDao {

	/**
	 * API to Create a new post
	 * @param post
	 * @return true for success
	 */
	public boolean createPost(Post post);
	/**
	 * API to Get all posts
	 * @return
	 */
	public List<Post> getAllPost();
}
