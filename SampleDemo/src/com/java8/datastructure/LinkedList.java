package com.java8.datastructure;

public class LinkedList {

	Node head;
	
	public void insert(int data) {
		Node newnode = new Node();
		newnode.data = data;
		newnode.next =null;
		
		if(head==null) {
			head = newnode;
			
		}else {
			Node last_node = head;
			while(last_node.next!=null) {
				last_node = last_node.next;
			}
			last_node.next = newnode;
			
		}
		
	}
	public void insert(int data,int index) {
		Node newnode = new Node();
		newnode.data = data;
		newnode.next =null;
		
		Node midNode;
		Node temp;
		if(index==0) {
			temp=head;
			head = newnode;
			head.next = temp;
		}else {
			midNode = head;
			for(int i=1;i<index;i++) {
				midNode = midNode.next;
				
			}
			temp = midNode.next;
			newnode.next = temp;
			midNode.next = newnode;
			
		}
		
		
	}
	
	 public  LinkedList deleteAtPosition(LinkedList list, int index) 
	    { 
	        // Store head node 
	        Node currNode = list.head, prev = null; 
	  
	        // 
	        // CASE 1: 
	        // If index is 0, then head node itself is to be deleted 
	  
	        if (index == 0 && currNode != null) { 
	            list.head = currNode.next; // Changed head 
	  
	            // Display the message 
	            System.out.println(index + " position element deleted"); 
	  
	            // Return the updated List 
	            return list; 
	        } 
	  
	        // 
	        // CASE 2: 
	        // If the index is greater than 0 but less than the size of LinkedList 
	        // 
	        // The counter 
	        int counter = 0; 
	  
	        // Count for the index to be deleted, 
	        // keep track of the previous node 
	        // as it is needed to change currNode.next 
	        while (currNode != null) { 
	  
	            if (counter == index) { 
	                // Since the currNode is the required position 
	                // Unlink currNode from linked list 
	                prev.next = currNode.next; 
	  
	                // Display the message 
	                System.out.println(index + " position element deleted"); 
	                break; 
	            } 
	            else { 
	                // If current position is not the index 
	                // continue to next node 
	                prev = currNode; 
	                currNode = currNode.next; 
	                counter++; 
	            } 
	        } 
	  
	        // If the position element was found, it should be at currNode 
	        // Therefore the currNode shall not be null 
	        // 
	        // CASE 3: The index is greater than the size of the LinkedList 
	        // 
	        // In this case, the currNode should be null 
	        if (currNode == null) { 
	            // Display the message 
	            System.out.println(index + " position element not found"); 
	        } 
	  
	        // return the List 
	        return list; 
	    } 
	
	public int size(LinkedList list) {
		Node n = list.head;
		int size=0;
		while(n!=null) {
			size = size+1;
			n= n.next;
		}
		return size;
	}
	
	public void printList(LinkedList list) {
		Node n = list.head;
		while(n!=null) {
			System.out.println(n.data);
			n= n.next;
			
		}
		
	}
}
