package com.ts.soofy.model;

import java.sql.Date;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Comment {
	private	int	id;
	private	Date	date;
	private int	upVotes;
	private	int	downVotes;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getUpVotes() {
		return upVotes;
	}
	public void setUpVotes(int upVotes) {
		this.upVotes = upVotes;
	}
	public int getDownVotes() {
		return downVotes;
	}
	public void setDownVotes(int downVotes) {
		this.downVotes = downVotes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//User user;

	
	
}
