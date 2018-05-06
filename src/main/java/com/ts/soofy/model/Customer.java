package com.ts.soofy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class   Customer {

	@GeneratedValue
	@Id
	private Long id;
	
	private String firstname;
	private String lastname;
	
	public Customer(String firtname, String lastname) {
		this.firstname = firtname;
		this.lastname = lastname;
	}
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firsname) {
		this.firstname = firsname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
		
	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id,
				firstname, lastname);
	}

}
