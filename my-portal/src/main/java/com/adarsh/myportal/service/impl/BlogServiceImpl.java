/*
 * (C) Copyright 
 * Author :Adarsh , created on 04-Dec-2017
 * BlogServiceImpl.java ,
 *
 */

package com.adarsh.myportal.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adarsh.myportal.api.service.BlogService;
import com.adarsh.myportal.api.vo.PostSearchVO;
import com.adarsh.myportal.api.vo.PostVO;
import com.adarsh.myportal.component.BlogComponent;

/**
 * @author Adarsh
 * Implementation of BlogService API
 */
@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	private BlogComponent blogComponentImpl;
	
	@Override
	public boolean postBlog(PostVO postVO) {
		blogComponentImpl.postBlog(postVO);
		return false;
	}

	@Override
	public List<PostVO> searchPosts(PostSearchVO postSearchRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePosts(List<PostVO> posts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PostVO editPostVO(PostVO post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String subscribeBlog(String mailId) {
		// TODO Auto-generated method stub
		return null;
	}

}
