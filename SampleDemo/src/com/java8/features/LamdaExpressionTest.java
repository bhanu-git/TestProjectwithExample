package com.java8.features;
interface Test{
	
	//public void m1();
	
	//public void m1(int a,int b);
	
	public int m1(int a, int b);
}
public class LamdaExpressionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Test t = ()-> System.out.println("m1() mehtod with no param");
		
		//method m1 with two params and does not return any value
		//Test t=(a,b)-> System.out.println("sum "+(a+b));
		//t.m1(10, 20);
		
		//Method m1 accept two params and it returns the value
		Test t = (a,b)->a+b;
		System.out.println(t.m1(10,20));
		System.out.println(t.m1(30, 40));
		
	}

}
