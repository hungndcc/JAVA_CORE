package com.vti.entity.Student;
import java.util.Scanner;

public class Test {

	public static void createAccount() {
		// Create Deparment
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketting";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "HR";
		//
		Position position1 = new Position();
		position1.id = 1;
		position1.name = "Position.Dev";
		
		Position position2 = new Position();
		position2.id = 2;
		position2.name = "Position.Test";
		
		Position position3 = new Position();
		position3.id = 3;
		position3.name = "Position.ScrumMaster";
		
		Position position4 = new Position();
		position4.id = 4;
		position4.name = "Position.PM";
		
		Scanner scanner = new Scanner(System.in);
		
		Account account4 = new Account();
		System.out.print("Id: ");
		account4.id = scanner.nextInt();
		
		System.out.print("Email: ");
		account4.email = scanner.next();
		
		System.out.print("User Name: ");
		account4.username = scanner.next();
		
		System.out.print("Full Name: ");
		account4.fullname = scanner.next();
		
		System.out.print("Department: ");
		int deptnum = scanner.nextInt();
		switch (deptnum) {
		case (1) :
			account4.department = department1;
			break;
		case (2) :
			account4.department = department2;
			break;
		case (3) :
			account4.department = department3;
			break;
		default : System.out.println("Nhap loi roi");
		}
		
		System.out.print("Position: ");
		int posnum = scanner.nextInt();
		switch (posnum) {
		case (1) :
			account4.position = position1;
			break;
		case (2) :
			account4.position = position2;
			break;
		case (3) :
			account4.position = position3;
			break;
		case (4) :
			account4.position = position4;
			break;
		default : System.out.println("Nhap loi roi");
		}
		
		System.out.println("Id: " + account4.id);
		System.out.println("Email: " + account4.email);
		System.out.println("UserName: " + account4.username);
		System.out.println("Department: " + account4.department.name);
		System.out.println("Position: " + account4.position.name);
	}
	
	public static void main(String[] args) {
		createAccount();
	}
}
