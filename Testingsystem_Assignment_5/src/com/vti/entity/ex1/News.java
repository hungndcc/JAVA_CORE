package com.vti.entity.ex1;

import java.util.Arrays;

public class News implements INews {
	private int id;
	private String title;
	private String publishdDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] rates;

	public News(int id, String title, String publishDate, String author, String content, int[] rates) {
		super();
		this.id = id;
		this.title = title;
		this.publishdDate = publishDate;
		this.author = author;
		this.content = content;
		this.averageRate = 0;
		this.rates = rates;
	}

	public News() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishdDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishdDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public int[] getRates() {
		return rates;
	}

	public void setRates(int[] rates) {
		this.rates = rates;
		
	}

	@Override
	public void display() {
		System.out.println("title: " + getTitle());
		System.out.println("publishdate: " + getPublishDate());
		System.out.println("author: " + getAuthor());
		System.out.println("content: " + getContent());
		System.out.println("average rate: " + getAverageRate());
	}

	@Override
	public float calculate() {
		averageRate = (rates[0] + rates[1] + rates[2]) / 3;
		return averageRate;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", publishdDate=" + publishdDate + ", author=" + author
				+ ", content=" + content + ", averageRate=" + averageRate + ", rates=" + Arrays.toString(rates) + "]";
	}
	
	

}