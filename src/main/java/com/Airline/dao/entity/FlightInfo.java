package com.Airline.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight_info")
public class FlightInfo implements Serializable{

	private static final long serialVersionUID = 8300842478355349724L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="flight_infoid")
	private Integer flightInfoId;
	
	@Column(name="flight_number")
	private String flightNumber;
	
	@Column(name="flight_type")
	private String flightType;
	
	@Column(name="numberof_seats")
	private Integer numberOfSeats;
	
	public FlightInfo() {
		
	}
	
	public Integer getFlightInfoId() {
		return flightInfoId;
	}
	public void setFlightInfoId(Integer flightInfoId) {
		this.flightInfoId = flightInfoId;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
}
