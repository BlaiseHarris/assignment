package com.hcl.collection;

import java.util.*;

public class ArrayListExample {
	// Creates a dynamic array; Stores the duplicate elements, and maintains
	// insertion order non-synchronized
	// when retrieving the values is faster
	// but manipulation of the array is slower
	public static void main(String[] args) {
		List<String> list2 = new ArrayList(); // Runtime Polymorphism
		
		list2.add("Justin");
		list2.add(new String("Amritpal"));
		list2.add("Rachid");
		list2.add("Dummy");
		
		Iterator<String> itr = list2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		list2.remove("Dummy");
		System.out.println(list2);
		System.out.println(list2.contains("Rachid"));
	}
}
