package com.Airline.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Airline.dao.entity.BookingRecord;

@Repository
public interface BookingRecordRepository extends JpaRepository<BookingRecord, Integer>{

}
