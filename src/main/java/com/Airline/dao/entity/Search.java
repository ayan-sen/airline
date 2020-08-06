package com.Airline.dao.entity;

import java.time.LocalDate;

public class Search {

	private String origin;
	private String destination;
	private String date;
	
	public Search() {}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
