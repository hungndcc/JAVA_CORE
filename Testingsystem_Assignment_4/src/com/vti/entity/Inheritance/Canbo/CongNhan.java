package com.vti.entity.Inheritance.Canbo;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private int bac;
	
	public CongNhan() {
		// TODO Auto-generated constructor stub
	}	
	
	public CongNhan(String name, int age, int bac) {
		super(name, age);
		this.bac = bac;
	}
	
	
	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		super.input();
		System.out.print("Nhap vao bac: ");
		setBac(scanner.nextInt());
	}

	@Override
	public void getInfo() {
		super.getInfo();
		String leftAlignFormatI = "| %-13s | %-10d |%n";
		//System.out.println("Bac : " + getBac());
		System.out.format(leftAlignFormatI, "Bac ", getBac());
		System.out.format("+---------------+------------+%n");

	}

	
	 
}
