package com.hcl.corejava;

import java.io.PrintStream;

public class Overloading {
	 public static int sum(int a, int b) {
		 return a + b;
	 }
	 static int sum(int a, int b, int c) {
		 return a + b + c;
	 }
	 
	 public static void main(String[] args) {
		int x = sum(1, 2);
		System.out.println(x);
		int z = sum(1, 2, 3);
		System.out.println(z);
	}
}
