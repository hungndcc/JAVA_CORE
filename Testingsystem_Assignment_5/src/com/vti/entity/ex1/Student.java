package com.vti.entity.ex1;

import java.util.Scanner;

public class Student {
	private int 	sbd;
	private String 	name;
	private String 	address;
	private int	uutien;
	
	Scanner sc = new Scanner(System.in);

	
	public Student(int sbd, String name, String address, int i) {
		super();
		this.sbd = sbd;
		this.name = name;
		this.address = address;
		this.uutien = i;
	}
	public Student() {
		inputInfor();
	}

	public int getSbd() {
		return sbd;
	}
	public void setSbd(int sbd) {
		this.sbd = sbd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUutien() {
		return uutien;
	}
	public void setUutien(int uutien) {
		this.uutien = uutien;
	}
	public void inputInfor() {
		//Student stu = new Student();
		System.out.println("sbd: ");
		this.setSbd(sc.nextInt());
		System.out.println("name: ");
		this.setName(sc.next());
		System.out.println("address: ");
		this.setAddress(sc.next());
		System.out.println("uutien: ");
		this.setUutien(sc.nextByte());
	}
	
	public void showInfor() {
		System.out.println("sbd: " + getSbd());
		System.out.println("name: " + getName());
		System.out.println("address: " + getAddress());
		System.out.println("uu tien: " + getUutien());
	}
	
	@Override
	public String toString() {
		return "sbd: " + sbd + ", name: " + name + ", address: " + address + ", uutien: " + uutien;
	}
	
	
}
