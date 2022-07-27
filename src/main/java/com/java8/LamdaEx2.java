package com.java8;

public class LamdaEx2 {
	interface EmpFactory<E extends Emp> {
		E create(String empFirstName, String empLastName);
	}
	
	public static void main(String[] args) {
		
		EmpFactory<Emp> empFac = Emp::new; // constructor reference
		Emp emp=empFac.create("Blaise", "Harris");
		System.out.println(emp);
	}
}
