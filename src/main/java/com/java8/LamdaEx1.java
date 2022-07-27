package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

public class LamdaEx1 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Bob","Sue","Jannett","Randy");
		
		Collections.sort(names, new Comparator<String>() {
				public int compare(String a, String b) {
					return b.compareTo(a);
				}
		});
		
		Collections.sort(names, (String a, String b)->{
			return b.compareTo(a);
		});
		
		List<String> names2=Arrays.asList("Bob",null,"Sue","Jannett","Randy");
		names2.sort(Comparator.nullsLast(String::compareTo)); // :: Method reference
		List<String> names3=null;
		Optional.ofNullable(names3); // Deals with null pointer exceptions
		System.out.println(names3);
	}
}
