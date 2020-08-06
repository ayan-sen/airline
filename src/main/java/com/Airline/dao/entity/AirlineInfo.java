package com.Airline.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airline_info")
public class AirlineInfo implements Serializable {

	private static final long serialVersionUID = 2049927213624664864L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="airline_id")
	private Integer airlineId;
	
	@Column(name="airline_logo")
	private String airlineLogo;
	
	@Column(name="name_of_airline")
	private String airlineName;
	
	public AirlineInfo() {
		
	}

	public Integer getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(Integer airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineLogo() {
		return airlineLogo;
	}

	public void setAirlineLogo(String airlineLogo) {
		this.airlineLogo = airlineLogo;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	
}
