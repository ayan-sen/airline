package com.Airline.dao.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Airline.dao.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

	List<Flight> findByFlightDateAndOrigin(LocalDate flightDate, String origin);
	
}
