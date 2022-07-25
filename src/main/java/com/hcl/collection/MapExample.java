package com.hcl.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	// Map is not a part of collections
	// in an org we have a lot of employees
	// with dupes this why we can give ids as the key
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(121, "Brandon");
		map.put(122, "Jack");
		map.put(123, "Gaurav");
		map.put(124, "Rachid");
		map.put(125, "Claudio");
		
		System.out.println(map);
		System.out.println(map.get(123));
		System.out.println(map.containsKey(122));
		System.out.println(map.containsValue("Claudi"));
		map.put(124, "Blaise");
		System.out.println(map);
		map.replace(123, "Chris");
		System.out.println(map);
		map.putIfAbsent(126, "Ajay");
		System.out.println(map);
	}
}
