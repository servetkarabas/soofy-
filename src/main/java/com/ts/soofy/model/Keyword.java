package com.ts.soofy.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Keyword {
	private	int	id;
	private	String	name;
	//private Category category;

}
