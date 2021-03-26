package com.vti.entity.Inheritance.Canbo;

import java.util.Scanner;

public class KySu extends CanBo {
	private String nganhDaoTao;

	public KySu() {
		// TODO Auto-generated constructor stub
	}
	
	public KySu(String name, int age, String nganhDaoTao) {
		super(name, age);
		this.nganhDaoTao = nganhDaoTao;
	}
	
	
	
	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		super.input();
		System.out.print("Nhap vao nganh dao tao: ");
		setNganhDaoTao(scanner.next());
	}

	@Override
	public void getInfo() {
		super.getInfo();
		String leftAlignFormatS = "| %-13s | %-10s |%n";
		System.out.format(leftAlignFormatS, "Nganh dao tao", getNganhDaoTao());
		System.out.format("+---------------+------------+%n");
	//	System.out.println("Nganh Dao Tao: " + getNganhDaoTao());
	}
}
