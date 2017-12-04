/*
 * (C) Copyright 
 * Author :Adarsh , created on 15-Nov-2017
 * BlogService.java , Exposes all blogging services
 *
 */

package com.adarsh.myportal.api.service;

import java.util.List;

import com.adarsh.myportal.api.vo.PostSearchVO;
import com.adarsh.myportal.api.vo.PostVO;

/**
 * @author Adarsh
 *BlogService : API Exposes all blogging services
 */
public interface BlogService {
	
	/**
	 * API to post blogs
	 * @param postVO
	 * @return true, if success
	 * false on error
	 */
	public boolean postBlog(PostVO postVO);
	
	/**
	 * API to get posts 
	 * @param postSearchRequest
	 * @return List<PostVO>
	 */
	public List<PostVO> searchPosts(PostSearchVO postSearchRequest);
	
	/**
	 * API to delete posts
	 * @param posts
	 */
	public void deletePosts(List<PostVO> posts);
	
	/**
	 * API to edit selected post
	 * @param post
	 * @return Edited post
	 */
	public PostVO editPostVO(PostVO post);
	
	/**
	 * API to subscribe posts
	 * @param mailId
	 * @return unique subscription id
	 */
	public String subscribeBlog(String mailId);
 
}
