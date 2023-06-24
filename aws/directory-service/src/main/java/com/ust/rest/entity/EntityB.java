package com.ust.rest.entity;

import javax.persistence.Entity;

@Entity
public class EntityB {
	public long id;
	public String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EntityB(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public EntityB() {
		// TODO Auto-generated constructor stub
	}
	

}
