package com.ts.soofy.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Category {
	private int	id;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
