package com.Airline.dao.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight implements Serializable{

	private static final long serialVersionUID = -6684148558310750033L;

	@Id
	@Column(name="id")
	private Long id;
	
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
	private Long invId;
	
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
	
	
	
}
