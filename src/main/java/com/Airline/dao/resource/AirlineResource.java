package com.Airline.dao.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Airline.dao.entity.AirlineInfo;
import com.Airline.dao.repository.AirlineInfoRepository;

@RestController
@RequestMapping(value="/airline")
public class AirlineResource {
	
	@Autowired
	AirlineInfoRepository airlineInfoRepository;
	
	@GetMapping(value="/all")
	public List<AirlineInfo> getAll(){
		return airlineInfoRepository.findAll();
	}
}
