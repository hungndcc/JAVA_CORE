package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private String homeTown;
	private int academicScore;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String homeTown) {
		super();
		this.id = id;
		this.name = name;
		this.homeTown = homeTown;
		this.academicScore = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public int getAcademicScore() {
		return academicScore;
	}

	public void setAcademicScore(int academicScore) {
		if (academicScore < 0 || academicScore >10) {
			System.out.println("Diem ko hop le!");
		} else {
			this.academicScore = academicScore;
		}
	}
	
	public int addAcademicScore(int addScore) {
		this.academicScore = academicScore + addScore;
		return academicScore;
	}
	
	public void showInfor() {
		System.out.println("Ten SV: " + name);
		if (academicScore < 4) {
			System.out.println("Hoc luc Yeu");
		} else if (academicScore > 4 && academicScore < 6) {
			System.out.println("Hoc luc Trung binh");
		} else if (academicScore >6 && academicScore <8) {
			System.out.println("Hoc luc Kha");
		} else {
			System.out.println("Hoc luc Gioi");
		}
	}
	
	
}
