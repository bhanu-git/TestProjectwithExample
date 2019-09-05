package com.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> l = new ArrayList();
		l.add(2);
		l.add(3);
		l.add(1);
		
		//Before Java 7 version
		//Collections.sort(l,new MyComparator());
		
		//Java 8 Lamda Expression
		//Comparator<Integer> c = (i1,i2)->(i1<i2)?1:(i1>i2)?-1:0;
		//Collections.sort(l,c);
		
		Collections.sort(l,(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
		
		System.out.println(l);
		
		//Streams 
		l.stream().forEach(System.out::println);
		
		Employee e = new Employee();
		e.setId(1);
		e.setName("bhanu");
		
		Employee e1 = new Employee();
		e1.setId(2);
		e1.setName("prakash");
		
		List<Employee> le = new ArrayList<Employee>();
		le.add(e);
		le.add(e1);
		
		for(Employee e3: le) {
			System.out.println(e3);
		}
		
		System.out.println("\n");
		//Sorting Employee obj
		Comparator<Employee> c =(Employee o1, Employee o2)->o2.getName().compareTo(o1.getName());
		Collections.sort(le,c);
		
		le.stream().forEach(System.out::println);
		
		System.out.println("\n Map sorting starts");
		//Map Sorting using java 8 lamda expressions
		
		Map<Employee,Integer> map = new HashMap<>();
		map.put(e, 1);
		map.put(e1,2);
		
		Set<Entry<Employee,Integer>> set = map.entrySet();
		List<Map.Entry<Employee, Integer>> listfromMap = new ArrayList<>(set);
		Comparator<Map.Entry<Employee, Integer>> c1 = (Map.Entry<Employee, Integer> o1, Map.Entry<Employee, Integer> o2)->o2.getKey().name.compareTo(o1.getKey().name);
		Collections.sort(listfromMap,c1);
		
		System.out.println("original map"+map);
		System.out.println("Sorted map"+ listfromMap);
		
		
		System.out.println("\n Java Streams example starts now");
		
		 LinkedHashMap<Employee, Integer> collect = map.entrySet().stream()
	                //Map<Employee, Integer>
	                .collect(Collectors.toMap(k -> (Employee) k.getKey(), e5 -> (Integer) e5.getValue()))
	                .entrySet()
	                .stream()
	                .sorted(c1)
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

	        collect.forEach((k, v) -> System.out.println(k + ":" + v));
	}

}
