package com.hcl.inner;

public class OuterClass {
	private int x=34;
	
	class Inner {
		void display() {
			System.out.println("The value of x is: " + x);
		}
	}
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		OuterClass.Inner outin = out.new Inner(); // how to use inner class method
		outin.display();
	}
}
