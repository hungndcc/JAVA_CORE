package com.vti.entity.Exercise1;

public class SecondaryStudent extends Student {
	private static int countSStudent = 0;
	
	public static int getCountSStudent() {
		return countSStudent;
	}

	public static void setCountSStudent(int countSStudent) {
		SecondaryStudent.countSStudent = countSStudent;
	}

	public SecondaryStudent(int id, String name) {
		super(id, name);
		countSStudent++;
	}
}
