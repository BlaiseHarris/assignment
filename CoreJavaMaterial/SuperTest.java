package com.hcl;

class Insurance {
	
	Insurance() {
		System.out.println("Calling og constructor");
	}
	String insName="Progressive";
	
	void print() {
		System.out.println(insName); // super references the base class
	}
	void insDetails(){
		System.out.println("Insurance Details");
	}
}
public class SuperTest extends Insurance{

	SuperTest() {
		System.out.println("Calling super constructor");
	}
	String insName="AAA";
	void insDetails(){
		System.out.println("Super test Insurance Details");
	}
	
	void print() {
		System.out.println(insName);
		System.out.println(super.insName); // super references the base class
	}
	 public static void main(String[] args) {
		Insurance s = new SuperTest(); // creates implicit super because it always refers to the base class
		s.print();
		s.insDetails();
		SuperTest s1 = new SuperTest();
		s1.print();
		s1.insDetails();
	}
}
