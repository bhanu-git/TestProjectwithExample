package com.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java8.util.Student;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Consumer prototype
	/*	interface Consumer<T>{
			public void accept(T t);
		}*/
		
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
			String grade = "";
			//Using Predicate Function
			if(ps.test(s)) return "A";
			else if(ps1.test(s)) return "B";
			else if(ps2.test(s)) return "C";
			else if(ps3.test(s)) return "Fail";
			
			return grade;			
		};
		
		Consumer<Student> cs = s1 ->{
			System.out.println("Name "+s1.name);
			System.out.println("Marks "+s1.marks);
			System.out.println("Grade "+fs.apply(s1));
			System.out.println();
		};
		//Java 8 foreach implementation
		li.forEach(student ->{
			cs.accept(student);
			/*if(ps.test(student)) { //if we want only District
				cs.accept(student);
			}*/
		});
		
	}

}
