package com.vti.backend.Exercise1;

public class MyMath {
	private final static float PI = 3.14f;
	
	public static int min(int a, int b) {
		if (a <= b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static float sum(int a) {
		return a + PI;
	}
	
	public static void main(String[] args) {
		System.out.println(MyMath.sum(3));
	}
	
}
