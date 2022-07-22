package com.hcl.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// NOT THREAD SAFE (non sychronized so two threads try to grab one thing
// can contain null; random order; defualt cap = 16;
public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Test 1");
		set.add(new String("Test 2"));
		set.add("Test 3");
		// set.add(null);
		set.add(new String("Test 2"));
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
