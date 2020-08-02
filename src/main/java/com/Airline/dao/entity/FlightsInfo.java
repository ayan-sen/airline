package com.Airline.dao.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flights_info")
public class FlightsInfo implements Serializable{

	private static final long serialVersionUID = -6683618319726700134L;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "airline_id")
	private AirlineInfo airlineInfo;
	
	@Id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "flight_infoid")
	private FlightInfo flightInfo;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((airlineInfo == null) ? 0 : airlineInfo.hashCode());
		result = prime * result
				+ ((flightInfo == null) ? 0 : flightInfo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightsInfo other = (FlightsInfo) obj;
		if (airlineInfo == null) {
			if (other.airlineInfo != null)
				return false;
		} else if (!airlineInfo.equals(other.airlineInfo))
			return false;
		if (flightInfo == null) {
			if (other.flightInfo != null)
				return false;
		} else if (!flightInfo.equals(other.flightInfo))
			return false;
		return true;
	}

	
	
}
