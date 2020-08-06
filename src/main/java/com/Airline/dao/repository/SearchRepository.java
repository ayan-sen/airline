package com.Airline.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Airline.dao.entity.Flight;

public interface SearchRepository extends JpaRepository<Flight, Long> {

}
