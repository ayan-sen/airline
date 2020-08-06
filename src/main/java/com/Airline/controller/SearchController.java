package com.Airline.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Airline.dao.entity.Flight;
import com.Airline.dao.entity.Search;
import com.Airline.service.SearchService;

@Controller
public class SearchController {

	@Autowired
	SearchService searchService;
	
	@GetMapping("/search-all")
	public String searchAll(Model model) {
		List<Flight> listFlights = searchService.getAll();
		model.addAttribute("listFlights", listFlights);
		return "search_all";
	}
	
	@GetMapping("/search-page")
	public String searchPage(Model model) {
		model.addAttribute("search", new Search());
		return "flight_search";
	}
	
	@PostMapping("/search-submit")
	public String searchSubmit(@ModelAttribute("search") Search search, Model model) {
		List<Flight> listFlights = searchService.getFlights(search.getOrigin(), search.getDestination(), LocalDate.parse(search.getDate()));
		model.addAttribute("listFlights", listFlights);
		return "search_result";
	}
	
	
}
