package com.vti.fontend.ex2;

import java.util.Scanner;

import com.vti.entity.ex2.ques3.HinhChuNhat;
import com.vti.entity.ex2.ques3.HinhVuong;

public class program3 {

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		HinhVuong hv = new HinhVuong();
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hv.tinhChuVi();
		hv.tinhDienTich();
	}

}
