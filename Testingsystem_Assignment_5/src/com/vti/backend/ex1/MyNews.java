package com.vti.backend.ex1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.ex1.News;

public class MyNews {

	private ArrayList<News> newsList;
	public MyNews() {
		newsList = new ArrayList<>();
	}
	
	public void data() {
		int[] arrayN1 = {1, 2, 3};
		News n1 = new News(1, "bai1", "30/03/2020", "hung1", "Day la content1", arrayN1);
		int[] arrayN2 = {4, 5, 6};
		News n2 = new News(2, "bai2", "30/03/2020", "hung2", "Day la content2", arrayN2);
		int[] arrayN3 = {7, 8, 9};
		News n3 = new News(3, "bai3", "30/03/2020", "hung3", "Day la content3", arrayN3);
		newsList.add(n1);
		newsList.add(n2);
		newsList.add(n3);
	}
	
	public static void menu() {
		System.out.println("=======Menu=======");
		System.out.println("1 - insert news");
		System.out.println("2 - view list news");
		System.out.println("3 - average rate");
		System.out.println("4 - exit");
	}
	
	public void insertNews() {
		News news = new News();
		int[] rates = new int[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("title: ");
		news.setTitle(sc.nextLine());
		System.out.print("publishdate: ");
		news.setPublishDate(sc.nextLine());
		System.out.print("author: ");
		news.setAuthor(sc.nextLine());
		System.out.print("content: ");
		news.setContent(sc.nextLine());
		System.out.println("avg rate: ");
		for (int i = 0; i < 3; i++) {
			System.out.print("rate " + (i+1) + ": ");
			rates[i] = sc.nextInt();
		}
		news.setRates(rates);
		newsList.add(news);
		System.out.println("Da them bai moi");
	
	}
	
	public void viewListNews() {
		for (News news : newsList) {
			news.display();
		}
	}
	public void avgRates() {
		for (News news : newsList) {
			news.getTitle();
			news.calculate();
			news.display();
		}
	}
	
}
