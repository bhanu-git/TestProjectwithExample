package com.java8.features;

import com.java8.util.DefaultMethodInterface;

public class DefaultMethodTest implements DefaultMethodInterface{
	
	//We should not use default method in class level like default void m1(){}
	public void m1() {
		System.out.println("Over ridden method of default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodTest dmt = new DefaultMethodTest();
		dmt.m1();
	}

}
