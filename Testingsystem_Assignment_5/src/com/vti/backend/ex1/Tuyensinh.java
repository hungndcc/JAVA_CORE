package com.vti.backend.ex1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.ex1.Student;

public class Tuyensinh implements ITuyensinh {
	private static ArrayList<Student> listStu = new ArrayList<>();
	private String[] a = {"Toan", "Ly", "Hoa"};
	private String[] b = {"Toan", "Hoa", "Sinh"};
	private String[] c = {"Van", "Su", "Dia"};
	List<String> khoiA = Arrays.asList(a);
	List<String> khoiB = Arrays.asList(b);
	List<String> khoiC = Arrays.asList(c);
	
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.println("=======Menu=======");
		System.out.println("1 - Insert Student");
		System.out.println("2 - Show Infor");
		System.out.println("3 - Find Student");
		System.out.println("4 - Exit");
	}
	
	public void data() {
		Student stu1 = new Student(1, "hung1", "nam dinh", 1);
		Student stu2 = new Student(2, "hung2", "nam dinh", 2);
		Student stu3 = new Student(3, "hung3", "nam dinh", 3);
		listStu.add(stu1);
		listStu.add(stu2);
		listStu.add(stu3);
	}
	
	public void insertStudent() {
		Student stu = new Student();
		listStu.add(stu);
		System.out.println("Them thanh cong");
		System.out.println("===========================");
	}
	
	public void display() {
		for (Student stu : listStu) {
			stu.showInfor();
		}
		System.out.println("===========================");
	}
	
	public void findSbd() {
		int choose;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap sbd: ");
		choose = sc.nextInt();
		boolean check = false;
		for (Student stu : listStu) {
			if (stu.getSbd() == choose) {
				stu.showInfor();
				check = true;
			}
		}
		if (check == false) {
			System.out.println("Ko tim thay nguoi nay");
		}
		System.out.println("===========================");
	}
//	public static void main (String[] args) {
//		Student stu1 = new Student(1, "hung", "nd", 1);
//		Student stu2 = new Student(2, "hung2", "hn", 2);
//		listStu.add(stu1);
//		listStu.add(stu2);
//		for (int i = 0; i< listStu.size(); i++) {
//			System.out.println(listStu.get(i));
//		}
//	}
}
