package com.Airline.dao.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight implements Serializable{

	private static final long serialVersionUID = -6684148558310750033L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="flight_date")
	private LocalDate flightDate;
	
	@Column(name="flight_number")
	private String flightNo;
	
	@Column(name="flight_time")
	private String flightTime;
	
	@Column(name="origin")
	private String origin;
	
	@Column(name="inv_id")
	private Integer invId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "flight_infoid")
	private FlightInfo flightInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fare_id")
	private Fare fare;

	@Override
	public String toString() {
		return "Flight [id=" + id + ", destination=" + destination
				+ ", flightDate=" + flightDate + ", flightNo=" + flightNo
				+ ", origin=" + origin + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
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

	public Integer getInvId() {
		return invId;
	}

	public void setInvId(Integer invId) {
		this.invId = invId;
	}

	public FlightInfo getFlightInfo() {
		return flightInfo;
	}

	public void setFlightInfo(FlightInfo flightInfo) {
		this.flightInfo = flightInfo;
	}

	public Fare getFare() {
		return fare;
	}

	public void setFare(Fare fare) {
		this.fare = fare;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
