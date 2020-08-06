package com.Airline.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {

	@Id
	@Column(name="inv_id")
	private Long invId;
	
	@Column(name="count")
	private Integer count;
	
	public Inventory() {
		
	}

	public Long getInvId() {
		return invId;
	}

	public void setInvId(Long invId) {
		this.invId = invId;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
}
