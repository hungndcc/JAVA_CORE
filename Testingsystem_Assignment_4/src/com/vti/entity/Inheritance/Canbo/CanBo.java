package com.vti.entity.Inheritance.Canbo;

import java.util.Scanner;

public class CanBo {
	private String name;
	private int age;
	private Gender gender;
	private String address;
	
	public CanBo() {
		// TODO Auto-generated constructor stub
	}
	public CanBo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(int gender) {
		if (gender == 0) {
			this.gender = Gender.valueOf("MALE");
		} else if (gender == 1) {
			this.gender = Gender.valueOf("FEMALE");
		} else {
			this.gender = Gender.valueOf("UNKNOW");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap ten: ");
		name = scanner.nextLine();
		
		System.out.print("Nhap tuoi: ");
		age = scanner.nextByte();
		
		System.out.print("Nhap gioi tinh: ");
		setGender(scanner.nextInt()); 
		
		
		System.out.print("Nhap dia chi: ");
		address = scanner.next();
	}
	
	public void getInfo() {
		String leftAlignFormatS = "| %-13s | %-10s |%n";

//		System.out.println("Ho ten: " + name);
//		System.out.println("Tuoi: " + age);
		System.out.format("+---------------+------------+%n");
		System.out.format(leftAlignFormatS, "Ho ten ", name);
		System.out.format(leftAlignFormatS, "Tuoi  ", age);

//		System.out.println("Gioi tinh: " + gender);
//		System.out.println("Dia chi: " + address);
	}
	
	
	
	
	
	
	

}
