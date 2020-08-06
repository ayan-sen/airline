package com.Airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Airline.dao.entity.Flight;
import com.Airline.service.SearchService;

@Controller
@RequestMapping("/search")
public class SearchController {

	@Autowired
	SearchService searchService;
	
//	@GetMapping("/")
//	public String searchPage() {
//		return "search_page";
//	}
	
	@GetMapping("/all")
	public String searchAll(Model model) {
		List<Flight> listFlights = searchService.getAll();
		model.addAttribute("listFlights", listFlights);
		return "search_all";
	}
}
