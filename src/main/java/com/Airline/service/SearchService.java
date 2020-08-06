package com.Airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Airline.dao.entity.Flight;
import com.Airline.dao.repository.SearchRepository;

@Service
public class SearchService {

	@Autowired
	private SearchRepository searchRepository;
	
	public List<Flight> getAll(){
		return searchRepository.findAll();
	}
}
