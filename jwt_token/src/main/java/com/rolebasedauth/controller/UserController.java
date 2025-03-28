package com.rolebasedauth.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rolebasedauth.entity.User;
import com.rolebasedauth.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

//	@PostConstruct
//	public void initRolesAndUser(){
//		userService.initRolesAndUser();
//	}

	@PostMapping({"/registerNewUser"})
	public User registerNewUser(@RequestBody User user) {
		System.out.println("Rest User Controller 27");
		return userService.registerNewUser(user);
		
	}



}
