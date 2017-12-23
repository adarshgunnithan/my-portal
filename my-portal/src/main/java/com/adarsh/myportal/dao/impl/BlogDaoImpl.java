/*
 * (C) Copyright 
 * Author :Adarsh , created on 19-Dec-2017
 * BlogDaoImpl.java ,
 *
 */

package com.adarsh.myportal.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.adarsh.myportal.dao.BlogDao;
import com.adarsh.myportal.dao.jpa.entites.Post;
@Transactional
@Repository
public class BlogDaoImpl implements BlogDao{
	@PersistenceContext	
	private EntityManager entityManager;	

	@Override
	public boolean createPost(Post post) {
		try{
		entityManager.persist(post);
		}catch(Exception e){
			System.out.println(e);
			System.out.println();
		}
		return false;
	}

	@Override
	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
