package com.hcl.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	// uses a doubly linked list to store the elements
	// searching values is harder but faster to manipulate list
	
	public static void main(String[] args) {
		List<String> linked = new LinkedList<>();
		linked.add("Justin");
		linked.add("John");
		
		Iterator<String> itr = linked.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
