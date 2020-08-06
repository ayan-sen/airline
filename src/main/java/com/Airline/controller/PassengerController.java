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

//	@GetMapping("/search")
//	public String searchForm() {
//		return "flight_search";
//	}

	@GetMapping("/login")
	public String loginForm(Model model) {
		model.addAttribute("login", new Login());
		return "login";
	}

	@PostMapping("/login")
	public String loginSubmit(@ModelAttribute Login login, Model model) {
		model.addAttribute("login", login);
		return "login_result";
	}
	
	@GetMapping("/registration")
	public String registrationForm(Model model) {
		model.addAttribute("registration", new Registration());
		return "registration";
	}
	
	@PostMapping("/registration")
	public String registrationSubmit(@ModelAttribute Registration registration, Model model) {
		model.addAttribute("registration", registration);
		return "registration_result";
	}
}
