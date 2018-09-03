package com.citi.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.domain.User;



/*@Controller
@RequestMapping("/user")*/
@RestController
public class UserController {

	@RequestMapping("/getUser")
	/*@ResponseBody*/
	public User hello() {
		User user = new User("citi", "1234", 22, new Date(), "hello citi");
		return user;
	}
}
