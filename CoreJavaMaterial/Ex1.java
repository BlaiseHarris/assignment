package com.hcl;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 45;
		int y = 0; // cant divide by zeero
		try { // attempts things that give exceptions
			// int x1 = Integer.parseInt("welcome"); // number formatting exception
			// int z = x/y; // Terminates due to an exception unless using try/catch
			getInt();
			//basically concattinating both exceptions to be caught
		} catch(ArithmeticException | NumberFormatException e) { // can catch every exception with Exception e also
			e.printStackTrace();// catch finds dividebyzero exeption then prints or number format stacktrace will help
		} finally { // this block will always executed whether exception is thrown or not
			System.out.println("continue working"); // since exception was caught the code will continue.
		}
		
		
	}
	
	public static void getInt() {
		int u = Integer.parseInt("xyz");
	}
}
