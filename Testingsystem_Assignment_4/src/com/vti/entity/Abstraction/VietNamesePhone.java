package com.vti.entity.Abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class VietNamesePhone extends Phone {
	private ArrayList<Contact> arrayContacts;
	public VietNamesePhone() {
		arrayContacts = new ArrayList<>();
	}
	Scanner sc = new Scanner(System.in);
	
	//Create Data
		public void data() {
			VietNamesePhone phone = new VietNamesePhone();
			Contact ct1 = new Contact("hung1", "12345");
			Contact ct2 = new Contact("hung2", "123456");
			Contact ct3 = new Contact("hung3", "1234567");
			Contact ct4 = new Contact("hung4", "12345678");
			Contact ct5 = new Contact("hung5", "123456789");
			arrayContacts.add(ct1);
			arrayContacts.add(ct2);
			arrayContacts.add(ct3);
			arrayContacts.add(ct4);
			arrayContacts.add(ct5);
		}
		
		//Menu
		public void menu() {
				String leftAlignFormat = "| %-15s | %-4d |%n";
				System.out.format("+------------------------+%n");
				System.out.format("|          Menu          |%n");
				System.out.format("+------------------------+%n");
				System.out.println("|1 - Insert Contact      |");
				System.out.println("|2 - Remove Contact 	 |");
				System.out.println("|3 - Update Contact      |");
				System.out.println("|4 - Search Contact      |");
				System.out.println("|5 - Thoat               |");
				System.out.format("+------------------------+%n");
		}
	
	public void insertContact() {
		Contact contact = new Contact();
		contact.addContact();
		arrayContacts.add(contact);
		System.out.println("Da them thanh cong Contact");
	}
	
	public void removeContact() {
		System.out.println("Nhap vao ten muon xoa");
		String name = sc.nextLine();
		boolean check = false;
		for (Contact contact : arrayContacts) {
			if (contact.getName().equals(name)) {
				arrayContacts.remove(contact);
				check = true;
			} 
		}
			if (check = false) {
				System.out.println("Ko tim thay Contact");
			}
		
	}
	
	public void updateContact() {
		System.out.println("Nhap vao so muon sua");
		String number = sc.nextLine();
		System.out.println("Nhap vao ten moi");
		String newName = sc.nextLine();
		System.out.println("Nhap vao so moi");
		String newNumber = sc.nextLine();
		boolean check = false;
		for (Contact contact : arrayContacts) {
			if (contact.getNumber().equals(number)) {
				contact.setName(newName);
				contact.setNumber(newNumber);
				check = true;
			} 
		}
		if (check = false) {
			System.out.println("Ko tim thay Contact");
		}
	}
	
	public void searchContact() {
		System.out.println("Nhap vao ten muon tim");
		String name = sc.nextLine();
		boolean check = false;
		for (Contact contact : arrayContacts) {
			if (contact.getName().equals(name)) {
				System.out.println(contact.toString());
				check = true;
			} 
		}
		if (check = false) {
			System.out.println("Ko tim thay Contact");
		}
	}
	
	public void showContact() {
		for (Contact contact : arrayContacts) {
			System.out.println(contact.toString());
		}
	}
}
