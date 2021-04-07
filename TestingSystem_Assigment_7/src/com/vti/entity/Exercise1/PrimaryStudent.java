package com.vti.entity.Exercise1;

public class PrimaryStudent extends Student{
	private static int countPStudent = 0;
	
	
	
	public static int getCountPStudent() {
		return countPStudent;
	}



	public static void setCountPStudent(int countPStudent) {
		PrimaryStudent.countPStudent = countPStudent;
	}



	public PrimaryStudent(int id, String name) {
		super(id, name);
		countPStudent++;
	}
}
