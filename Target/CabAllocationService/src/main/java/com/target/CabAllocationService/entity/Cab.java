/**
 * 
 */
package com.target.CabAllocationService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Anant Kishore
 *
 */
@Entity
public class Cab {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "cost")
	private int cost;

	@Column(name = "capacity")
	private int capacity;

	/**
	 * 
	 */
	public Cab() {
	}

	public Cab(Long id, int cost, int capacity) {
		super();
		this.id = id;
		this.cost = cost;
		this.capacity = capacity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
