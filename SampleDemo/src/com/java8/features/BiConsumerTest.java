package com.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import com.java8.util.Student;

public class BiConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//requirement to increase the student marks plus 10	
		List<Student> li = new ArrayList<>();
		
		BiFunction<String,Integer, Student> bif = (sname,smarks) -> new Student(sname,smarks);
		
		li.add(bif.apply("bhanu", 90));
		li.add(bif.apply("Prakash", 60));
		li.add(bif.apply("kolli", 50));
		
		//adding 10 marks for each student using BiConsumer
		
		BiConsumer<Student,Integer> bic = (stu,marks) -> stu.marks = stu.marks +marks;
		
		li.forEach(student ->{
			bic.accept(student, 10);
		});
		
		li.forEach(stu ->{
			System.out.println(stu.name+"  "+stu.marks);
		});
	}

}
