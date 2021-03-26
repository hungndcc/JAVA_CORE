package com.vti.entity.Inheritance;

public class Student extends Person {
	protected int id;

	public Student(String name, int id) {
		super(name);
		this.id = id;
	}
	
	
}
