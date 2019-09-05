package com.java8.features;

public class SampleThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Before java 7 version
		//MyRunnable r = new MyRunnable(); - using Lambda expressions, no need to add seperate class 
		//Thread thread1= new Thread(r);
		//thread1.start();
		
		//Annanomous inner class
		
	/*	Runnable r = new Runnable() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Child Thread");
				}
			}
			
		};*/
		
		
		//Java 1.8 version onwords no need use seperate implementation class. use lamdaExpressions
				Runnable r =()->{
					for(int i=0;i<5;i++) {
						System.out.println("Child Thread");
					}
				};
		
				
				Thread thread1= new Thread(r);
				thread1.start();
		
		
		
		for(int j=0;j<5;j++) {
			System.out.println("Main Thread");
		}
	}

}
