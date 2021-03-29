package com.vti.backend;
import java.time.LocalDate;

import com.vti.entity.Student.Account;
import com.vti.entity.Student.Department;
import com.vti.entity.Student.Group;
import com.vti.entity.Student.Position;

public class Exercise1Constructor {
	public void question1() {
		Department dep1 = new Department();
		Department dep2 = new Department("HR");
		System.out.println(dep1);
		System.out.println(dep2);
	};
	
	public void question2() {
		Position pos1 = new Position(1,"Manager");
		Position pos2 = new Position(2,"TL");
		System.out.println(pos1);
		System.out.println(pos2);
	}
	
	public void question3() {
	Account acc1 = new Account();
	Account acc2 = new Account("hungndcc");
	Account acc3 = new Account(1 ,"quochung1110@gmail.com" ,"hungndcc1" ,"Hung" ,"Nguyen");
	Position pos1 = new Position(1,"Manager");
	Account acc4 = new Account(2 ,"quochung1110@gmail.com" ,"hungndcc2" ,"Hung" ,"Nguyen" ,pos1);
	Position pos2 = new Position(2,"TL");
	Account acc5 = new Account(2 ,"quochung1110@gmail.com" ,"hungndcc3" ,"Hung" ,"Nguyen" ,pos2 ,LocalDate.parse("2020-05-15"));
	
	Group gr1 = new Group();
	Account[] accounts = {acc1 ,acc2 ,acc3};
	Group gr2 = new Group("VTI" ,acc1 ,accounts ,LocalDate.parse("2020-05-15"));
	
	String[] usernames = {"hungndcc1" ,"hungndcc2" ,"hungndcc3"};
	Group gr3 = new Group("VTI2" ,acc2 ,usernames ,LocalDate.parse("2020-05-15"));
	}
}


