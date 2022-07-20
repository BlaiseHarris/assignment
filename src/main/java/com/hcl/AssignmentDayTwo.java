package com.hcl;

import java.util.*;

public class AssignmentDayTwo {
	
	public static Scanner sc = new Scanner(System.in);
	
	static private void fibonacciSeries() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Fibonacci Seqence");
		System.out.println("--------------------");
		System.out.print("First Integer: ");
		int first = sc.nextInt();
		System.out.println();
		System.out.print("Second Integer: ");
		int second = sc.nextInt();
		System.out.println();
		System.out.print("Length of sequence: ");
		int length = sc.nextInt();
				
		list.add(first);
		list.add(second);
		int third = first + second;
		list.add(third);
		
		for(int i = 2; i < length; i++) {
			int sum = list.get(i - 1) + list.get(i);
			list.add(sum);
		}
		
		System.out.println();
		System.out.println(list);
	}
	
	static private void isPrime() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Is the value prime?");
		System.out.println("--------------------");
		System.out.print("Integer to test: ");
		int first = sc.nextInt();
		
		 if (first <= 1) {
	            System.out.println("False");
		 }
	        for (int i = 2; i < first; i++) {
	            if (first % i == 0) {
	                System.out.println("False");
	            }
	        }
	        System.out.println("True");
	}
	
	static private void swapVariables() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Swap the variables");
		System.out.println("--------------------");
		System.out.print("Integer x: ");
		int first = sc.nextInt();
		System.out.println();
		System.out.print("Integer y: ");
		int second = sc.nextInt();
		
		int temp = first;
		first = second;
		second = temp;
		
		System.out.println();
	    System.out.println("Integer x: " + first + " Integer y: " + second);
	}
	
	static private boolean addToSum() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Add to a Sum");
		System.out.println("--------------------");
		System.out.print("Integer x: ");
		int first = sc.nextInt();
		System.out.println();
		System.out.print("Integer y: ");
		int second = sc.nextInt();
		System.out.println();
		System.out.print("Sum: ");
		int sum = sc.nextInt();
		
		System.out.println("The sum is " + (first + second));
		
		if(first + second == sum) {
			return true;
		} else {
			return false;
		}
	}
	
	static private String reversedString() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Reverse the String");
		System.out.println("--------------------");
		System.out.print("String to reverse: ");
		String input = sc.next();
		
		String backwardsWord = "";
		for(int i = input.length() - 1; i >= 0; i--) {
			backwardsWord = backwardsWord + input.charAt(i);
		}
		
		return backwardsWord;
	}
	
	public static void main(String[] args) {
		fibonacciSeries();
		isPrime();
		swapVariables();
		System.out.println(addToSum());
		System.out.println(reversedString());
		sc.close();
	}
}
