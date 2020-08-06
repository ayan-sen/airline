package com.Airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Airline.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
}
