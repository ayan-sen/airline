package com.Airline.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="passenger_id")
	private Integer passengerId;
	
	@Column(name="email_address")
	private String emailAddress;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="mobile_number")
	private Long mobileNumber;
	
	@Column(name="booking_id")
	private Integer bookingId;
	
	public Passenger() {
		
	}

	public Integer getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	
	public static Passenger create(User user) {
		Passenger p = new Passenger();
		p.setEmailAddress(user.getEmailAddress());
		p.setFirstName(user.getFirstName());
		p.setGender(user.getGender());
		p.setLastName(user.getLastName());
		p.setMobileNumber(user.getMobileNumber());
		
		return p;
	}
}
