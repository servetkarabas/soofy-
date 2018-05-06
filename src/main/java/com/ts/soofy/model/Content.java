package com.ts.soofy.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Content {
	private int id;
	private int date;
	private byte[] data; // tipi düşünecek.
	private String title;
	private byte[] hash;
	private String language;
	private float score;
	

}
