package com.hcl.corejava;

class Bike {
	void speed() {
		System.out.println("100mph");
	}
}

public class Overriding extends Bike {
	void speed(){
		System.out.println("200mph");
	}
	public static void main(String[] args) {
		Bike b = new Bike();
		b.speed();
		Bike b1 = new Overriding();
		b1.speed();
		Overriding o = new Overriding();
		
	}
	
}
