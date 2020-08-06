package com.Airline.dao.entity;

public class Book {

	private Long userId;
	private String firstName;
	private String lastName;
	private String gender;
	private String mobileNumber;
	private Long flightId;
	
	public Book() {
		
	}
	
	
	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public Long getFlightId() {
		return flightId;
	}


	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
