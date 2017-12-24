/*
 * (C) Copyright 
 * Author :Adarsh , created on 19-Dec-2017
 * BlogComponentImpl.java ,
 *
 */

package com.adarsh.myportal.component.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adarsh.myportal.api.vo.PostSearchVO;
import com.adarsh.myportal.api.vo.PostVO;
import com.adarsh.myportal.component.BlogComponent;
import com.adarsh.myportal.dao.BlogDao;
import com.adarsh.myportal.dao.jpa.entites.Post;

/**
 * @author Adarsh Blog component implementation
 */
@Component
public class BlogComponentImpl implements BlogComponent {

	@Autowired
	private BlogDao blogDaoImpl;

	/**
	 * API method implementation to post blogs
	 * 
	 * @param postVO
	 * @return true, if success false on error
	 */
	@Override
	public boolean postBlog(PostVO postVO) {
		// TODO Auto-generated method stub
		Post post = new Post();
		post.setTitle(postVO.getTitle());
		post.setDescription(postVO.getDescription());
		blogDaoImpl.createPost(post);
		return false;
	}

	/**
	 * API method implementation to get posts
	 * 
	 * @param postSearchRequest
	 * @return List<PostVO>
	 */
	@Override
	public List<PostVO> searchPosts(PostSearchVO postSearchRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * API method implementation to delete posts
	 * 
	 * @param posts
	 */
	@Override
	public void deletePosts(List<PostVO> posts) {
		// TODO Auto-generated method stub

	}

	/**
	 * API method implementation to edit selected post
	 * 
	 * @param post
	 * @return Edited post
	 */
	@Override
	public PostVO editPostVO(PostVO post) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * API method implementation to subscribe posts
	 * 
	 * @param mailId
	 * @return unique subscription id
	 */
	@Override
	public String subscribeBlog(String mailId) {
		// TODO Auto-generated method stub
		return null;
	}

}
