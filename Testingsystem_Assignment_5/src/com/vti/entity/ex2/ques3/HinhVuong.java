package com.vti.entity.ex2.ques3;

public class HinhVuong extends HinhChuNhat {
	
	public void setHCN() {
		System.out.print("Nhap chieu dai canh hinh vuong: ");
		setCd(sc.nextInt());
	}
	
	@Override
	public void tinhChuVi() {
		System.out.println("Tinh chu vi hinh vuong: " + 4 * getCd());
	}
	
	@Override
	public void tinhDienTich() {
		System.out.println("Tinh dien tich hinh vuong: " + (getCd() * getCd()));
	}
}
