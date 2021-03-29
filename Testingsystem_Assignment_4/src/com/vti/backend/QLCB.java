package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Inheritance.Canbo.*;

public class QLCB {
	private ArrayList<CanBo> canBos;
	private ArrayList<CanBo> cbTrung;

	public QLCB () {
		canBos = new ArrayList<>();
	}
	
	// Data Can bo
	public void data() {
		CanBo cn1 = new CongNhan("congnhan1", 10, 1);
		CanBo cn2 = new CongNhan("congnhan2", 11, 1);
		
		CanBo ks1 = new KySu("kysu1", 12, "May tinh");
		CanBo ks2 = new KySu("kysu2", 13, "Ky thuat");
		CanBo ks3 = new KySu("kysu1", 13, "May tinh");

		
		CanBo nv1 = new NhanVien("nhanvien1", 14, "Tuyen Sinh");
		CanBo nv2 = new NhanVien("nhanvien2", 15, "Dao tao");
		
		canBos.add(cn1);
		canBos.add(cn2);
		canBos.add(ks1);
		canBos.add(ks2);
		canBos.add(nv1);
		canBos.add(nv2);
		canBos.add(ks3);
	}

	//Menu
	public void menu() {
		String leftAlignFormat = "| %-15s | %-4d |%n";
		System.out.format("+------------------------+%n");
		System.out.format("|          Menu          |%n");
		System.out.format("+------------------------+%n");
		System.out.println("|1 - Them can bo         |");
		System.out.println("|2 - Xem thong tin can bo|");
		System.out.println("|3 - Tim can bo          |");
		System.out.println("|4 - Xoa can bo          |");
		System.out.println("|5 - Thoat               |");
		System.out.format("+------------------------+%n");
		
	}
	
	// add Can bo
	public void addCanBo() {
		Scanner scanner = new Scanner(System.in);
		int n;
		
		System.out.print("Nhap so can bo muon them: ");
		n = scanner.nextInt();
		
		byte choose;
		CanBo canBo = new CanBo();
		for (int i = 0; i < n; i++) {
			System.out.println("Chon can bo (1 - Ky su, 2 - Cong nhan, 3 - Nhan vien )");
			choose = scanner.nextByte();
			
			switch (choose) {
			case 1:
				System.out.println("Nhap vao 1 ky su: ");
				canBo = new KySu();
				break;
			case 2:
				System.out.println("Nhap vao 1 cong nhan: ");
				canBo = new CongNhan();
				break;
			case 3:
				System.out.println("Nhap vao 1 nhan vien: ");
				canBo = new NhanVien();
				break;
			default:
				System.out.println("Ban da nhap sai");
				i--;
				break;
			} 
			canBo.input();
			canBos.add(canBo);
			System.out.println("Da xong nguoi thu " + (i+1));
		}
	}
	
	// tim Can bo
	public void findCanBo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ten can bo muon tim");
		String name = scanner.nextLine();
		boolean check = false;
		for (CanBo canBo: canBos) {
			if (name.equals(canBo.getName()) ) {
				canBo.getInfo();
				check = true;
			}
		} 
		
		if (check = false) {
			System.out.println("Ko co can bo");
		}
	}
	
	// hien thi thong tin danh sach can bo
	public void showInfoCanBo() {
		for (CanBo canBo : canBos) {
			canBo.getInfo();
		}
	}
	
	// nhap vao ten can bo va xoa can bo do
	public void deleteCanBo() {
		cbTrung = new ArrayList<>();
		String name;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten nguoi muon xoa");
		name = scanner.nextLine();
		boolean check = false;
		for (CanBo canBo: canBos) {
			if (name.equals(canBo.getName()) ) {
				canBo.getInfo();
				cbTrung.add(canBo);
				check = true;
			}
		} 
		if (check = false) {
			System.out.println("Ko co can bo");
		} else {
			System.out.println("Co " + cbTrung.size() + " can bo trung ten nhau, b hay xoa theo tuoi");
			System.out.println("Nhap tuoi nguoi muon xoa");
			int age = scanner.nextInt();
			for (CanBo canBo : cbTrung) {
				if (canBo.getAge() == age) {
					canBos.remove(canBo);
					System.out.println("Da xoa thanh cong");
				}
			}
		}
	}
	
	
	
}
	