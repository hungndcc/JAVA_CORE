package com.vti.entity.Abstraction;

import java.util.Scanner;

public class Contact {
	private String name;
	private String number;
	
	public Contact() {
	}

	public Contact(String number, String name) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public void addContact() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap ten: ");
		name = scanner.nextLine();
		
		System.out.print("Nhap so dien thoai: ");
		number = scanner.nextLine();
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + "]";
	}
	
}
