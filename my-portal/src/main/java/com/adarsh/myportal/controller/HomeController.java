/*
 * (C) Copyright 
 * Author :Adarsh , created on 04-Dec-2017
 * BlogController.java ,
 *
 */
package com.adarsh.myportal.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Adarsh
 *Home Controller to health check
 */
@RestController
public class HomeController {
	
	  @RequestMapping("/")
	    public String home(){
	        return "Hello World!";
	    }
	}

