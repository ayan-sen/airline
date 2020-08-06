package com.Airline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PassengerController {

	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
	
}