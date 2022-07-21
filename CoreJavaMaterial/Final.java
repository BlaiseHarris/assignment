package com.hcl;

public final class Final { // Can't be inherited
	final int x = 12;
	final void display() {
		System.out.println("hello"); // final methods can be overloaded not overridden
	}
}
//class Test extends Final { //error due to final
	
//}

class ABC {
	static final int d;
	static {
		d=12;
	}
	public static void main(String[] args) {
		System.out.println(ABC.d);
	}
}
