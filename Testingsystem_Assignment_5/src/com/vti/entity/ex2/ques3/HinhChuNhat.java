package com.vti.entity.ex2.ques3;

import java.util.Scanner;

public class HinhChuNhat {
	private int cd;
	private int cr;
	Scanner sc = new Scanner(System.in);
	public HinhChuNhat() {
		setHCN();
	}
	
	public int getCd() {
		return cd;
	}

	public void setCd(int cd) {
		this.cd = cd;
	}

	public int getCr() {
		return cr;
	}

	public void setCr(int cr) {
		this.cr = cr;
	}
	public void setHCN() {
		System.out.print("Nhap chieu dai hcn: ");
		setCd(sc.nextInt());
		System.out.print("Nhap chieu rong hcn: ");
		setCr(sc.nextInt());
	}

	public void tinhChuVi() {
		System.out.println("Tinh chu vi hinh chu nhat: " + 2*(cd + cr));
	}
	
	public void tinhDienTich() {
		System.out.println("Tinh dien tich hinh chu nhat: " + cd * cr);

	}
}
