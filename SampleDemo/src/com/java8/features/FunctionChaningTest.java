package com.java8.features;

import java.util.function.Function;

public class FunctionChaningTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//f1.andThen(f2).apply(i)  ---- First f1 followed by f2.
		//f1.compose(f2).apply(i) -----First f2 and then f1.
		
		Function<Integer,Integer> f1 = i->2*i;
		Function<Integer, Integer> f2 = i-> i*i*i;
		
		System.out.println(f1.andThen(f2).apply(2)); //64
		System.out.println(f1.compose(f2).apply(2)); //16
		
		
	}

}
