package com.vti.fontend.Abstraction;

import java.util.Scanner;

import com.vti.entity.Abstraction.VietNamesePhone;

public class question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VietNamesePhone phone = new VietNamesePhone();

		phone.data();

		while (true) {
			phone.menu();
			byte choose;
			System.out.print("Nhap yeu cau: ");
			choose = sc.nextByte();

			switch (choose) {
			case 1:
				phone.insertContact();
				break;
			case 2:
				phone.removeContact();
				break;
			case 3:
				phone.updateContact();
				break;
			case 4:
				phone.searchContact();
				break;
			case 5:
				phone.showContact();
				break;
			case 6:
				System.out.println("Hen gap lai");
				return;
			default:
				System.out.println("Nhap ko dung chuc nang");

			}
		}

	}

	
}
