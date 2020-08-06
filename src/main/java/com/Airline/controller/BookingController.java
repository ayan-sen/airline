package com.Airline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Airline.dao.entity.Book;

@Controller
public class BookingController {

	@GetMapping("/book-page")
	public String bookingPage(Model model) {
		model.addAttribute("book", new Book());
		return "booking-form";
	}
	
	@PostMapping("/book-submit")
	public String bookingSubmit(@ModelAttribute("book") Book book) {
		
		return "search_result";
	}
}
