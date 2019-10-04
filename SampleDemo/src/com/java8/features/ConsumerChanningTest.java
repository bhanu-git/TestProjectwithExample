package com.java8.features;

import java.util.function.Consumer;

import com.java8.util.Student;

public class ConsumerChanningTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Student> c1 = s -> System.out.println(s.name+" Joined in college");
		Consumer<Student> c2 = s -> System.out.println(s.name+" passed with marks "+s.marks);
		Consumer<Student> c3 = s -> System.out.println(s.name+" is eligible for ECET");
		Consumer<Student> cc = c1.andThen(c2).andThen(c3);
		Student st = new Student("bhanu",100);
		cc.accept(st);
		
		
	}

}
