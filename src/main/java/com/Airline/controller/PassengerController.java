package com.Airline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Airline.dao.entity.Login;
import com.Airline.dao.entity.Registration;

@Controller
public class PassengerController {

	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
	
}
