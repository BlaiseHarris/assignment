package com.java8;

import java.util.function.Predicate;

public class LamdaEx3 {
	
	@FunctionalInterface
	interface Vehicle {
		void speed();
		default void speed2() {};
		static void speed3() {};
	}
	
	public static void main(String[] args) {
		Predicate<String> p = (s)->s.length()>0;
		p.test("dylan"); // true
		p.negate().test("dylan"); // false
		Predicate<String> isEmpty=String::isEmpty;
		System.out.println(isEmpty);
		
		Predicate<Integer> p1=i->(i<20);
		System.out.println(p1.test(23));
	}
}
