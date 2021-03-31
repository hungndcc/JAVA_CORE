package com.vti.backend.ex2;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.ex2.ques2.Person;
import com.vti.entity.ex2.ques2.Student;

public class ques2 {
	private ArrayList<Student> students;
	
	public void createData() {
		students = new ArrayList<>();
		Student stu1 = new Student("hung1", 12, 8);
		Student stu2 = new Student("hung2", 15, 2);
		Student stu3 = new Student("hung3", 16, 9);
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
	}
	
	public void showData() {
		for (Student stu : students) {
			System.out.println(stu);
		}
	}
	
	public void xetHB() {
		for (Student stu : students) {
			if (stu.getDiemtb() >= 8.0) {
				System.out.println(stu.getName() + " co the nhan hoc bong");
			} else {
				System.out.println(stu.getName() + " ko the nhan hoc bong");
			}
		}
	}
	
	
}
