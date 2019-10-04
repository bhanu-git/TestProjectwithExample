package com.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import com.java8.util.Employee;

public class BiFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> li = new ArrayList<>();
		
		BiFunction<Integer,String,Employee> bif = (eno,ename) -> new Employee(eno,ename);
		li.add(bif.apply(1, "bhanu"));
		li.add(bif.apply(2, "Prakash"));
		li.add(bif.apply(3, "kolli"));
		
		//retrive employee details
		li.forEach(System.out::println);
		
		li.forEach(e->{
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println();
		});
		
	
	}

}
