package com.vti.entity.ex2.ques2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.vti.Utils.DateUtils;

public class Person implements IPerson {
	private String name;
	private Gender gender;
	private Date date;
	private String address;
	
	public Person(String name, Gender gender, Date date, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.address = address;
	}
	
	public Person() throws ParseException {
		inputInfor();
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(int gender) {
		if (gender == 1) {
			this.gender = Gender.valueOf("MALE");
		} else if (gender == 2) {
			this.gender = Gender.valueOf("FEMALE");
		} else {
			this.gender = Gender.valueOf("UNKNOW");
		}
	}

	public Date getDate() {
		return date;
	}

	public void setDate() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ngay co dinh dang: dd/MM/yyyy");
		String sdate = sc.next();
		DateUtils du = new DateUtils();
		this.date = du.stringToDate(sdate);
		
		 
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void inputInfor() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		name = sc.next();
		System.out.println("Nhap gioi tinh: ");
		setGender(sc.nextInt());
		System.out.println("Nhap ngay: ");
		setDate();
		System.out.println("Nhap dia chi: ");
		address = sc.next();
		System.out.println("Nhap thanh cong!");
	}
	
	public void showInfor() {
		toString();
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + ", Gender: " + getGender() + ", Date: " + getDate() + ", Address: " + getAddress();
	}
}
