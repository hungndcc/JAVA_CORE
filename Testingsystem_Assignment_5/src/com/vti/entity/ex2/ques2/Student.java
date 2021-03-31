package com.vti.entity.ex2.ques2;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
	private int 	msv;
	private float 	diemtb;
	private String 	email;

	public Student(String name, Gender gender, Date date, String address, int msv, float diemtb, String email) {
		super(name, gender, date, address);
		this.msv = msv;
		this.diemtb = diemtb;
		this.email = email;
		
	}
	
	public Student(String name, int msv, float diemtb) {
		super(name);
		this.msv = msv;
		this.diemtb = diemtb;
	}
	
	public Student() throws ParseException {
		inputInfor();
	}

	public int getMsv() {
		return msv;
	}

	public void setMsv(int msv) {
		this.msv = msv;
	}

	public float getDiemtb() {
		return diemtb;
	}

	public void setDiemtb(float diemtb) {
		this.diemtb = diemtb;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// a
	@Override
	public void inputInfor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap msv: ");
		msv = sc.nextInt();
		System.out.println("Nhap diem trung binh: ");
		diemtb = sc.nextFloat();
		System.out.println("Email: ");
		email = sc.next();
	}
	@Override
	public void showInfor() {
		toString();
	}
	
	@Override
	public String toString() {
		String personStr = super.toString();
		return personStr + ", MSV: " + msv + ", Diem TB: " + diemtb + ", Email: " + email;
	}
}
