package com.Airline.dao.entity;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking_record")
public class BookingRecord {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="booking_id")
	private Integer bookingId;
	
	@Column(name="booking_date")
	private LocalDate bookingDate;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="fare")
	private Double fare;
	
	@Column(name="flight_date")
	private LocalDate flightDate;
	
	@Column(name="flight_number")
	private String flightNumber;
	
	@Column(name="flight_time")
	private String flightTime;
	
	@Column(name="origin")
	private String origin;
	
	@Column(name="status")
	private String status;
	
	public BookingRecord() {
		
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
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

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
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

	public static BookingRecord createFromFlightData(Flight flight) {
		BookingRecord b = new BookingRecord();
		b.setBookingDate(LocalDate.now());
		b.setDestination(flight.getDestination());
		b.setFare(flight.getFare().getFare());
		b.setFlightDate(flight.getFlightDate());
		b.setFlightNumber(flight.getFlightNo());
		b.setFlightTime(flight.getFlightTime());
		b.setOrigin(flight.getOrigin());
		b.setStatus("CONFIRMED");
		return b;
	}
}






























