package com.vti.ScannerUltis;

import java.util.Scanner;

public class ScannerUltis {
	static Scanner scanner = new Scanner(System.in);
	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}
	
	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static Double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}
	
	public static boolean isNumber(String inputString) {
		try {
			Integer.parseInt(inputString);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Wrong inputing!");
			return false;
		}
	}
	public static int inputAge() {
		while (true) {
			//System.out.print("Insert your age: ");
			int age = inputInt("Wrong inputing! Please input an age as int, input again.");
			if (age <= 0) {
				System.err.println("Wrong inputing! The age must be greater than 0, please input again.");

			} else {
				return age;
			}
		}
	}
	
	public static void inputAgeGreaterThan18() {
		
	}
}
