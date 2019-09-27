package com.java8.features;

public class SymposiumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				X(1,Integer.MAX_VALUE+1);
	}
	public static void X(int v1, int v2) {
		System.out.println("1");
	}
	public static void X(int... v) {
		System.out.println("2");
	}

}
