package com.vti.entity.ques4;

public class Department {
	private String name;
	private int id;
	
	
	public Department() {
		super();
	}


	public Department(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Department [name=" + name + ", id=" + id + "]";
	}
	
	
}
