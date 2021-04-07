package com.vti.backend.Exercise1;

import java.util.ArrayList;

import com.vti.entity.Exercise1.PrimaryStudent;
import com.vti.entity.Exercise1.SecondaryStudent;
import com.vti.entity.Exercise1.Student;

public class Ex1 {
	private static ArrayList<Student> students;
	
	public Ex1() {
		students = new ArrayList<>();
	}
	public void data() {
		Student stu1 = new Student(1, "hung1");students.add(stu1);
		Student stu2 = new Student(2, "hung2");students.add(stu2);
		Student stu3 = new Student(3, "hung3");students.add(stu3);
		Student pstu1 = new PrimaryStudent(4, "hung4");students.add(pstu1);
		Student pstu2 = new PrimaryStudent(5, "hung5");students.add(pstu2);
		Student sstu1 = new SecondaryStudent(6, "hung6");students.add(sstu1);
		Student sstu2 = new SecondaryStudent(7, "hung7");students.add(sstu2);
		//Student sstu3 = new SecondaryStudent(8, "hung8");students.add(sstu3);
		//Student sstu4 = new SecondaryStudent(9, "hung9");students.add(sstu4);
		if (students.size() >7) {
			System.err.println("Chi duoc toi da 7 hoc sinh");
			System.exit(0);
		}
	}
	
	public void question1() {
		for (Student stu : students) {
			stu.showInfor();
		}
		
	}
	
	public void question2() {
		System.out.println("Moi hoc sinh nop quy 100k");
		for (Student stu : students) {
			stu.payFee(100);
		}
		System.out.println("So tien quy la: " + Student.getMoneyGroup() + "k");
		System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan");
		Student.takeMoney(50);
		System.out.println("So tien quy la: " + Student.getMoneyGroup() + "k");
		System.out.println("Student thứ 2 lấy 20k đi mua bánh mì");
		Student.takeMoney(20);
		System.out.println("So tien quy la: " + Student.getMoneyGroup() + "k");
		System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm");
		Student.takeMoney(150);
		System.out.println("So tien quy la: " + Student.getMoneyGroup() + "k");
		System.out.println("cả nhóm mỗi người lại đóng quỹ mỗi người 50k");
		for (Student stu : students) {
			stu.payFee(50);
		}
		System.out.println("So tien quy la: " + Student.getMoneyGroup() + "k");
	}
	
	public void question6() {
		System.out.println(Student.getCountStudent());
		System.out.println("So hoc sinh Primary: " + PrimaryStudent.getCountPStudent());
		System.out.println("So hoc sinh Secondary: " + SecondaryStudent.getCountSStudent());
	}
	
}
