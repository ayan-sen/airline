package com.Airline.dao.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking_record")
public class BookingRecord {

	@Id
	@Column(name="booking_id")
	private Long bookingId;
	
	@Column(name="booking_date")
	private Date bookingDate;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="fare")
	private Double fare;
	
	@Column(name="flight_date")
	private Date flightDate;
	
	@Column(name="flight_number")
	private String flightNumber;
	
	@Column(name="flight_time")
	private Time flightTime;
	
	@Column(name="origin")
	private String origin;
	
	@Column(name="status")
	private String status;
	
	public BookingRecord() {
		
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Time getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(Time flightTime) {
		this.flightTime = flightTime;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}






























