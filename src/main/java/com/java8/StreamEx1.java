package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamEx1 {
	// Stream represents a stream of objects from a source
	// supports -> aggregate operations
	// most of stream operations are called intermediate
	// parrallelStream
	
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(3,2,2,3,7,3,5);
		//get the list of square the unique numbers
		List<Integer> squareList = numbers
				.stream()
				.map(s->s*s).distinct().collect(Collectors.toList());
		System.out.println(squareList);
		
		Random r = new Random();
		
		r.ints().limit(2).forEach(System.out::println);
		
		// Parallel stream
		List<String> list = Arrays.asList("abc","","bc","efg");
		long count = list.parallelStream().filter(s->s.isEmpty()).count();
		System.out.println();
		
		String[] arr = {"Welcome", "To", "Java"};
	}
}
