package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Canbo.CanBo;
import com.vti.entity.Canbo.CongNhan;
import com.vti.entity.Canbo.KySu;
import com.vti.entity.Canbo.NhanVien;

public class QLCB {
	private ArrayList<CanBo> canBos;

	public QLCB () {
		canBos = new ArrayList<>();
	}
	
	// add Can bo
	public void addCanBo() {
		Scanner scanner = new Scanner(System.in);
		int n;
		
		System.out.println("Nhap so can bo muon them: ");
		n = scanner.nextInt();
		
		byte choose;
		CanBo canBo = new CanBo();
		for (int i = 0; i < n; i++) {
			System.out.println("Chon can bo (1 - Ky su, 2 - Cong nhan, 3 - Nhan vien )");
			choose = scanner.nextByte();
			
			switch (choose) {
			case 1:
				canBo = new KySu();
				break;
			case 2:
				canBo = new CongNhan();
				break;
			case 3:
				canBo = new NhanVien();
			default:
				System.out.println("Ban da nhap sai");
				i--;
				break;
			} 
			canBo.input();
			canBos.add(canBo);
		}
	}
	
	// tim Can bo
	public void findCanBo() {
		String name;
		Scanner scanner = new Scanner(System.in);
		
		name = scanner.nextLine();
		for (CanBo canBo: canBos) {
			if (name.equals(canBo.getName()) ) {
				canBo.getInfo();
			}
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
		String name;
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		
		canBos.removeIf(cb -> name.equals(cb.getName()));
	}
	
	
	
}
	