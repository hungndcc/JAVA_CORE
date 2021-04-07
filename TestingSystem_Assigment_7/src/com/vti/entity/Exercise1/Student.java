package com.vti.entity.Exercise1;

import java.util.ArrayList;

public class Student {

	private int id;
	private String name;
	private static String college = "Dai hoc Bach Khoa";
	private static int moneyGroup = 0;
	private static int countStudent = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	public static int getMoneyGroup() {
		return moneyGroup;
	}

	public static void setMoneyGroup(int moneyGroup) {
		Student.moneyGroup = moneyGroup;
	}

	public static int getCountStudent() {
		return countStudent;
	}

	public static void setCountStudent(int countStudent) {
		Student.countStudent = countStudent;
	}

	public Student() {
		super();
		setCountStudent(getCountStudent() + 1);
	}

	public Student(int id, String name) {
		super();
		setCountStudent(getCountStudent() + 1);
		this.id = id;
		this.name = name;
	}

	public void showInfor() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Coolege: " + college);
	}

	public void payFee(int fee) {
		moneyGroup = moneyGroup + fee;
	}

	public static void takeMoney(int money) {
		if ((moneyGroup - money) >= 0) {
			moneyGroup = moneyGroup - money;
		} else {
			System.out.println("Not enough money");
		}
	}

}
