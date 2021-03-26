package com.vti.entity.Inheritance;

public class HighSchoolStudent extends Student {
	private String clazz;
	private String desiredUniversity;
	public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}
	
	@Override
	public String toString() {
		return "id: " +id + ", name: " + name + ", class: " + clazz + ", desiredUniversity: " + desiredUniversity;
	}
	public static void main(String[] args) {
		HighSchoolStudent hs = new  HighSchoolStudent("Nam", 1, "Chuyen Van", "Dai hoc cong nghe");
		System.out.println(hs.toString());
	}
}
