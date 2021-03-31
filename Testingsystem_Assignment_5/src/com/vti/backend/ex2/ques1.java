package com.vti.backend.ex2;

import java.util.ArrayList;

import com.vti.entity.ex2.ques1.Student;

public class ques1 {
	
	ArrayList<Student> listStu = new ArrayList<>();
	
	public void createData() {
		Student stu1 = new Student(1, "hung1", 1);
		Student stu2 = new Student(2, "hung2", 1);
		Student stu3 = new Student(3, "hung3", 1);
		
		Student stu4 = new Student(4, "hung4", 2);
		Student stu5 = new Student(5, "hung5", 2);
		Student stu6 = new Student(6, "hung6", 2);
		
		Student stu7 = new Student(7, "hung7", 3);
		Student stu8 = new Student(8, "hung8", 3);
		Student stu9 = new Student(9, "hung9", 3);
		listStu.add(stu1);
		listStu.add(stu2);
		listStu.add(stu3);
		listStu.add(stu4);
		listStu.add(stu5);
		listStu.add(stu6);
		listStu.add(stu7);
		listStu.add(stu8);
		listStu.add(stu9);
	}
	
//	public void diemdanh() {
//		System.out.println( + "Diem danh");
//	}
//	@Override
//	public void hocbai() {
//		System.out.println(this.name + "Dang hoc bai");
//	}
//	@Override
//	public void donvesinh() {
//		System.out.println(this.name + "Dang don ve sinh");
//	}
	
	public void goidiemdanh() {
		for (Student stu : listStu) {
			stu.diemdanh();
		}
	}
	
	public void nhom1hocbai() {
		for (Student stu : listStu) {
			if (stu.getGroup() == 1) {
				stu.hocbai();
			}
		}
	}
	
	public void nhom2donvesinh() {
		for (Student stu : listStu) {
			if (stu.getGroup() == 2) {
				stu.donvesinh();
			}
		}
	}
}
