package com.Airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Airline.dao.entity.Login;
import com.Airline.dao.entity.User;
import com.Airline.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/registration-page")
	public String registrationPage(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	
	@PostMapping("/registration-submit")
	public String registrationSubmit(@ModelAttribute("user") User user) {
		userService.save(user);
		return "redirect:/login";
	}
	
	@GetMapping("/login-page")
	public String loginPage(Model model) {
		model.addAttribute("login", new Login());
		return "login";
	}

	@PostMapping("/login-submit")
	public String loginSubmit(@ModelAttribute("login") Login login) {
		User user = userService.getUserByUsernameAndPassword(login.getUsername(), login.getPassword());
		return user != null ? "login_result" : "redirect:/login-page";
	}
}
