package com.vti.entity.Exercise2;

public /* final */ class Student {
	private int id;
	private String name;
	
	public Student(final int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public final void Study() {
		System.out.println("Dang hoc bai ...");
	}
	
}
