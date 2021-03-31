package com.vti.fontend.ex1;

import java.util.Scanner;

import com.vti.backend.ex1.Tuyensinh;

public class program2 {

	public static void main(String[] args) {
		Tuyensinh ts = new Tuyensinh();
		ts.data();
		while (true) {
			byte choose;
			Scanner sc = new Scanner(System.in);
			ts.menu();
			System.out.println("Nhap yeu cau");
			choose = sc.nextByte();

			switch (choose) {
			case 1:
				ts.insertStudent();
				break;
			case 2:
				ts.display();
				break;
			case 3:
				ts.findSbd();
				break;
			case 4:
				System.out.println("hen gap lai");
				return;
			default:
				System.out.println("Nhap sai");
			}
		}
	}

}
