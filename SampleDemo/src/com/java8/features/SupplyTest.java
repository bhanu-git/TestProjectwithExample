package com.java8.features;

import java.util.Date;
import java.util.function.Supplier;

public class SupplyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Supply prototype
	/*	interface Supplier<R>{
			public R get();
		}*/
		
		Supplier<Date> sf = ()-> new Date();
		System.out.println(sf.get());
		
		//To generate random password
		Supplier<String> sf1 = ()->{
			
			String otp ="";
			for(int i =0;i<6;i++) {
				otp = otp+(int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(sf1.get());
		
	}

}
