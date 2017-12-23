/*
 * (C) Copyright 
 * Author :Adarsh , created on 04-Dec-2017
 * BlogController.java ,
 *
 */

package com.adarsh.myportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adarsh.myportal.api.service.BlogService;
import com.adarsh.myportal.api.vo.PostSearchVO;
import com.adarsh.myportal.api.vo.PostVO;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Adarsh
 *Blog Controller : Controller interacts with UI
 *Controller acts an end point for service exposed
 */
@RestController("blog")
public class BlogController {
	@Autowired
	private BlogService blogServiceImpl;
	/**
	 * API to post blogs
	 * @param postVO
	 * @return true, if success
	 * false on error
	 */
	@RequestMapping(value="/blog/post",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,headers = {
    "content-type=application/json" })
	public boolean postBlog(@RequestBody  PostVO postVO){
		
		try{
			PostVO tes = new PostVO();
			tes.setTitle("bcd");
			tes.setDescription("desc");
			ObjectMapper ob = new ObjectMapper();
			String jsonInString = ob.writeValueAsString(tes);
			System.out.println(jsonInString);

		}catch(Exception e){
			System.out.println(e);
		}
		blogServiceImpl.postBlog(postVO);
		return false;
		
	}
	
	/**
	 * API to get posts 
	 * @param postSearchRequest
	 * @return List<PostVO>
	 */
	@RequestMapping(value="/blog/search",method=RequestMethod.POST)
	public List<PostVO> searchPosts(PostSearchVO postSearchRequest){
		return null;
		
	}
	
	/**
	 * API to delete posts
	 * @param posts
	 */
	@RequestMapping(value="/blog/delete",method=RequestMethod.POST)
	public void deletePosts(List<PostVO> posts){
		
	}
	
	/**
	 * API to edit selected post
	 * @param post
	 * @return Edited post
	 */
	@RequestMapping(value="/blog/edit",method=RequestMethod.POST)
	public PostVO editPostVO(PostVO post){
		return post;
		
	}
	
	/**
	 * API to subscribe posts
	 * @param mailId
	 * @return unique subscription id
	 */
	@RequestMapping(value="/blog/subscribe",method=RequestMethod.POST)
	public String subscribeBlog(String mailId){
		return mailId;
		
	}
	@RequestMapping(value="/blog/test",method=RequestMethod.GET)
	public String test(){
		return "blogtest";
		
	}
}
