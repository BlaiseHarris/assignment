package com.hcl;

public class CustomException extends Exception{ // first rule to making exceptions it must extend exceptions
	public CustomException(String s) {
		super(s);
	}
}

// cant run class if already in another class.
class main { // how to run main if you cant. Right click class file -> run as -> run config -> search for class
	public static void main(String[] args) {
		try {
			throw new CustomException("Exception");
		} catch (Exception e) {System.out.println(e.getMessage());}
		
	}
}
