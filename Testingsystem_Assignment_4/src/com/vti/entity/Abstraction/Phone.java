package com.vti.entity.Abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Phone {
	private ArrayList<Contact> arrayContacts;
	public Phone() {
		arrayContacts = new ArrayList<>();
	}
	Scanner sc = new Scanner(System.in);
		
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
				System.out.println("|5 - Show Contact        |");
				System.out.println("|6 - Exit 		         |");
				System.out.format("+------------------------+%n");
		}
	
	public abstract void insertContact();
	
	public abstract void removeContact();
	
	public abstract void updateContact();
	
	public abstract void searchContact();
	
	public abstract void showContact();
}
