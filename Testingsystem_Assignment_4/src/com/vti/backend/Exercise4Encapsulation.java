package com.vti.backend;

import com.vti.entity.Student;

public class Exercise4Encapsulation {

	//Create Student
	public static void question1() {
		Student stu1 = new Student(1, "hung1", "nd");
		Student stu2 = new Student(2, "hung2", "hd");
		Student stu3 = new Student(3, "hung3", "hn");
		
		stu1.setAcademicScore(5);
		stu1.addAcademicScore(2);
		stu1.showInfor();

	}
}
