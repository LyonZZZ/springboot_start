package com.citi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.domain.Resource;



@RestController
public class HelloController {
	@Autowired
	private Resource resource;

	@RequestMapping("/hello")
	public Object hello() {
		return "hello springboot";
		
	}
	@RequestMapping("/getResource")
	public Object getResource() {
		Resource bean = new Resource(resource.getName(),resource.getWebsite(),resource.getLanguage());
		return bean;
	}
}
