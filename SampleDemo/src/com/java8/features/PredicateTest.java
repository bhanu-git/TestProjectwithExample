package com.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.java8.util.Employee;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Predicate - if any conditional check go for Predicate
		/*interface Predicate<T>{
			public boolean test(T t) {
				
			}
		}*/
		
		Predicate<Integer> p1 = i->i%2==0;
		//Predicate<Integer> p1 = i->i%2==0?true:false;
		System.out.println("Predicate 1 result "+p1.test(10));
		System.out.println("Predicate 1 result "+p1.test(11));
		System.out.println();
		
		Predicate<Integer> p2 = i->i/2==5;
		System.out.println("Predicate 2 result "+p2.test(10));
		System.out.println("Predicate 2 result "+p2.test(11));
		
		System.out.println();
		//Predicate Join 
		System.out.println("Predicate and Predicate result "+p1.and(p2).test(10));
		System.out.println("Predicate or Predicate result "+p1.and(p2).test(11));
		
		System.out.println();
		
		System.out.println("Predicate or Predicate result "+p1.or(p2).test(10));
		System.out.println("Predicate or Predicate result "+p1.or(p2).test(11));
		
		System.out.println();
		
		System.out.println("Predicate negate Predicate result "+p1.negate().test(10));
		System.out.println("Predicate negate Predicate result "+p2.negate().test(10));
		System.out.println();
		
		IntPredicate ip1 = i->i/2==0;
		System.out.println(ip1.test(10));//
		
		List<Employee> li = new ArrayList<>();
		li.add(new Employee(1,"bhanu",28));
		li.add(new Employee(2,"prakash",29));
		li.add(new Employee(3,"kolli",30));
		
		Predicate<Employee> pemp = s->s.getAge()>28;
		for(Employee emp: li) {
			if(pemp.test(emp)) {
				System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getAge());
			}
		}
		
	}

}
