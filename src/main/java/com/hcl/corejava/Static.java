package com.hcl.corejava;

public class Static {

	static int y = 0;
	Static(){
		y++; // 0
		System.out.println(y); // 1
	}
	public static void main(String[] args) {
		Static s1 = new Static(); // 1 w/o static  1 w/ static before variable y
		Static s2 = new Static(); // 1             2
		Static s3 = new Static(); // 1             3
	}
}
