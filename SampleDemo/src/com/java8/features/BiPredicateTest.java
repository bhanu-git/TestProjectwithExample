package com.java8.features;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BiPredicate prototype
		/*interface BiPredicate<T1,T2>{
			public Boolean test(T1 t1, T2 t2);
		}*/
		
		//To check the sum of the given integers are even or not
		BiPredicate<Integer,Integer> bp = (a,b) ->(a+b)%2==0;
		
		System.out.println(bp.test(10, 5));
		
		if(bp.test(10, 5)) {
			System.out.println("sum of the numbers are even");
		}else {
			System.out.println("sum of the numebrs are odd");
		}
	}

}
