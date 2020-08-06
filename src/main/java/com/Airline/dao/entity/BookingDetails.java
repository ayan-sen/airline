package com.Airline.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking_details")
public class BookingDetails {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="booking_id")
	private Long bookingId;
	
	@Column(name="passenger_id")
	private Long passengerId;
	
	public BookingDetails() {
		
	}
	
	public BookingDetails(Long bookingId, Long passengerId) {
		super();
		this.bookingId = bookingId;
		this.passengerId = passengerId;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}
	
}
