package com.Airline;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Airline.dao.entity.Flight;
import com.Airline.dao.repository.FlightRepository;

@EnableJpaRepositories(basePackages="com.Airline.dao.repository")
@SpringBootApplication
public class AirlineApplication implements CommandLineRunner {

	@Resource
	private FlightRepository flightRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AirlineApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		List<Flight> flights= flightRepository.findByFlightDateAndOrigin(LocalDate.of(2020, 8, 21), "CHENNAI");
		
		System.out.println(flights);
	}

}
