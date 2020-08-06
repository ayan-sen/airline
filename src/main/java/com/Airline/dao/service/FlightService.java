package com.Airline.dao.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.Airline.dao.entity.BookingDetails;
import com.Airline.dao.entity.BookingRecord;
import com.Airline.dao.entity.Flight;
import com.Airline.dao.entity.Passenger;
import com.Airline.dao.entity.User;
import com.Airline.dao.repository.BookingDetailsRepository;
import com.Airline.dao.repository.BookingRecordRepository;
import com.Airline.dao.repository.FlightRepository;
import com.Airline.dao.repository.PassengerRepository;
import com.Airline.dao.repository.UserRepository;

@Service
public class FlightService {

	@Resource
	private UserRepository userRepository;
	
	@Resource
	private BookingRecordRepository bookingRecordRepository;
	
	@Resource
	private FlightRepository flightRepository;
	
	@Resource
	private PassengerRepository passengerRepository;
	
	@Resource
	private BookingDetailsRepository bookingDetailsRepository;
	
	@Transactional
	public void bookFlight(List<Long> userIds, Long flightId) {
		
		List<User> users = userIds.stream().map(u -> userRepository.findById(u).get()).collect(Collectors.toList());
		
		List<Passenger> passengers = users.stream().map(u -> Passenger.create(u)).collect(Collectors.toList());
		
		Flight flight = flightRepository.findById(flightId).get();
		
		BookingRecord record = BookingRecord.createFromFlightData(flight);
		
		BookingRecord savedRecord = bookingRecordRepository.save(record);
		
		List<Passenger> savedPassengers = passengerRepository.saveAll(passengers);
		
		List<BookingDetails> details = savedPassengers.stream().map(p -> new BookingDetails(savedRecord.getBookingId() ,p.getPassengerId())).collect(Collectors.toList());
		
		bookingDetailsRepository.saveAll(details);
		
		
		
	}
}
