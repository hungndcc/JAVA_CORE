package com.vti.fontend.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.backend.ex1.MyNews;
import com.vti.entity.ex1.News;

public class program1 {
	public static void main(String[] args) {
		MyNews question = new MyNews();
		ArrayList<News> newsList = new ArrayList<>();
		question.data();
		while (true) {
			byte choose;
			Scanner sc = new Scanner(System.in);
			MyNews.menu();
			choose = sc.nextByte();

			switch (choose) {
			case 1:
				question.insertNews();
				break;
			case 2:
				question.viewListNews();
				break;
			case 3:
				question.avgRates();
				break;
			case 4:
				System.out.println("Hen gap lai");
				return;
			default:
				System.out.println("Nhap sai!");
			}
		}
	}

}
