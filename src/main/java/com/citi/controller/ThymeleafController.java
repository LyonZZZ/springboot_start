package com.citi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.citi.domain.User;

@Controller
@RequestMapping("/th")
public class ThymeleafController {

	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("name","thymeleaf~~~citi bank");
		return "thymeleaf/index";
		
	}
	@RequestMapping("/center")
	public String center() {
		return "thymeleaf/center/center";
	}
	
	@RequestMapping("/test")
	public String test(ModelMap map) {
		User user = new User();
		user.setName("manager");
		user.setAge(18);
		user.setPassword("123456");
		user.setBirthday(new Date());
		user.setDesc("<font color='green'><b>hello</b></font>");
		map.addAttribute("user",user);
		
		User user1 = new User();
		user1.setName("Wang");
		user1.setAge(20);
		user1.setPassword("12345678");
		user1.setBirthday(new Date());
		user1.setDesc("<font color='green'><b>hello</b></font>");
		
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		userList.add(user1);
		map.addAttribute("userList",userList);
		return "thymeleaf/test/test";
	}
	
	
	@RequestMapping("/postform")
	public String postform(User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		return "redirect:/th/test";
	}
	

}
