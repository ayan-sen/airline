package com.Airline.dao.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Airline.dao.entity.Flight;

@Repository
public interface SearchRepository extends JpaRepository<Flight, Long> {

	public List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination, LocalDate flightDate);
}
