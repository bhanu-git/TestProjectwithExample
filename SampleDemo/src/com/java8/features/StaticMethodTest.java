package com.java8.features;

public class StaticMethodTest implements StaticMethodInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static methods we can call using interface name directly.
		StaticMethodInterface.main(args);
		
		
		//bydefault static methods inside interfaces are not availble in class level.
		
		//so below callings are invalid. it will cause compilation erros.
		
	/*	x(); //calling static method directly in implemented class
		StaticMethodTest.x(); //calling static method using implemented class name
		StaticMethodTest test = new StaticMethodTest();
		test.x(); // calling static method using implemented class object	
	 */
	}

}
