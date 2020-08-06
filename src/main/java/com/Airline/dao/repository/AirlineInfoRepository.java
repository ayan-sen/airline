package com.Airline.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Airline.dao.entity.AirlineInfo;

@Repository
public interface AirlineInfoRepository extends JpaRepository<AirlineInfo, Long>{

	
}
