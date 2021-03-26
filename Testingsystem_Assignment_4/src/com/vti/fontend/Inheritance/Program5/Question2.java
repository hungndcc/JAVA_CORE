package com.vti.fontend.Inheritance.Program5;

import java.util.Scanner;

import com.vti.backend.QLCB;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QLCB qlcb = new QLCB();
		qlcb.data();

		while (true) {
			qlcb.menu();
			byte choose;
			System.out.print("Nhap yeu cau: ");
			choose = sc.nextByte();

			switch (choose) {
			case 1:
				qlcb.addCanBo();
				break;
			case 2:
				qlcb.showInfoCanBo();
				break;
			case 3:
				qlcb.findCanBo();
				break;
			case 4:
				qlcb.deleteCanBo();
				break;
			case 5:
				System.out.println("Hen gap lai");
				return;
			default:
				System.out.println("Nhap ko dung chuc nang");

			}
		}

	}

}
