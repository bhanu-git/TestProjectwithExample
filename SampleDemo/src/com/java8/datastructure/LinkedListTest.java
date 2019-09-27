package com.java8.datastructure;

public class LinkedListTest {

	public static void main(String args[]) {
		
		LinkedList li= new LinkedList();
		li.insert(1);
		li.insert(2);
		li.insert(3);
		
		//li.insert(4,0);
		//li.insert(5,2);
		//li.insert(6,5);
		
		li.deleteAtPosition(li, 1);
		li.printList(li);
		//System.out.println(li.size(li));
		
	}
}
