package com.vti.backend.ques4;

import java.util.ArrayList;

import com.vti.entity.ques4.Department;

public class ques4 {
	private ArrayList<Department> departments;
	public ques4() {
	departments = new ArrayList<>();
	}
	public void data() {
		Department dept1 = new Department("HR", 1);
		Department dept2 = new Department("Marketing", 2);
		Department dept3 = new Department("BA", 3);
		departments.add(dept1);
		departments.add(dept2);
		departments.add(dept3);
	}
	
	public void getIndex(int index) {
		try {
		System.out.println(departments.get(index));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Cannot find Department");
		}
	}
}
