package com.vti.entity.Inheritance.Canbo;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec;
	
	public NhanVien() {
	}
	
	public NhanVien(String name, int age, String congViec) {
		super(name, age);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		super.input();
		System.out.print("Nhap vao cong viec: ");
		setCongViec(scanner.next());
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		String leftAlignFormatS = "| %-13s | %-10s |%n";
		System.out.format(leftAlignFormatS, "Cong viec", getCongViec());
		System.out.format("+---------------+------------+%n");
	//	System.out.println("Cong viec: " + getCongViec());
	}
	
}
