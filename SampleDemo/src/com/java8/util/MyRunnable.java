package com.java8.util;

public class MyRunnable implements Runnable
{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child thread");
		}
	}
}