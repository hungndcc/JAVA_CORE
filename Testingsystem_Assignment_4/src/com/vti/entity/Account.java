package com.vti.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.vti.Utils.DateUtils;


public class Account {
	private int id;
	private String email;
	private String username;
	private String fullName;
	private Position position;
	private Date createDate;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public long getMillis() {
		return millis;
	}

	public void setMillis(long millis) {
		this.millis = millis;
	}

	public java.sql.Date getDate() {
		return date;
	}

	public void setDate(java.sql.Date date) {
		this.date = date;
	}

	long millis=System.currentTimeMillis();   
	java.sql.Date date=new java.sql.Date(millis);  
	
	public Account() {
		
	}

	public Account(int id, String email, String username, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = firstName + lastName;
	}
	
	public Account(int id, String email, String username, String firstName, String lastName, Position position) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = firstName + lastName;
		this.position = position;
		this.createDate = date;
	}
	
	public Account(int id, String email, String username, String firstName, String lastName, Position position, String date) throws ParseException {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = firstName + lastName;
		this.position = position;
		DateUtils du = new DateUtils();
		this.createDate = du.stringToDate(date);
		
	}
	 

	
}
