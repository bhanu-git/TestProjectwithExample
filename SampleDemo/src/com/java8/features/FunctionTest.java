package com.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java8.util.Student;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Function declaration - some specific business logic we can use Function
		/*interface Function<T,R>{
			public R apply(T t) {
				
			}
		}*/
		
		Function<Integer,Integer> f = i->i*i;
		System.out.println(f.apply(10));
		
		Function<String, Integer> f1 = s->s.length();
		System.out.println(f1.apply("bhanu"));
		
		Function<String, String> f2 = s->s.toUpperCase();
		System.out.println(f2.apply("bhanu"));
		
		//Customize Function def.
		
		List<Student> li = new ArrayList<>();
		li.add(new Student("bhanu",100));
		li.add(new Student("prakash",60));
		li.add(new Student("kolli",50));
		li.add(new Student("sai",34));
		
		Predicate<Student> ps = s ->(s.marks>=100);
		Predicate<Student> ps1 = s ->(s.marks>=60);
		Predicate<Student> ps2 = s ->(s.marks>=35);
		Predicate<Student> ps3 = s ->(s.marks<35);
		
		Function<Student,String> fs = s -> {
			//int marks = s.marks;
			String grade = "";
			/*if(marks>=100) {
				grade = "A[Distinct]";
			}else if(marks>=60) {
				grade ="First grade";
			}else if(marks>=35) {
				grade = "Second Grade";
			}else if(marks<35) {
				grade = "Fail";
			}*/
			//Using Predicate Function
			if(ps.test(s)) return "A";
			else if(ps1.test(s)) return "B";
			else if(ps2.test(s)) return "C";
			else if(ps3.test(s)) return "Fail";
			
			return grade;			
		};
		
		//Java 8 foreach implementation
		li.forEach(student ->{
			//print all the student details
			//System.out.println("Name "+student.name);
			//System.out.println("Marks "+student.marks);
			//System.out.println("Grade "+fs.apply(student));
			//System.out.println();
			if(ps.test(student)) { //if we want only District
				System.out.println("Name "+student.name);
				System.out.println("Marks "+student.marks);
				System.out.println("Grade "+fs.apply(student));
				System.out.println();
			}
		});
		
		
		
	}

}
