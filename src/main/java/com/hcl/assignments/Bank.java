package com.hcl.assignments;

public class Bank {
	
	Bank() {}
	
	public long deposit(long bal, long amount) {
		long balance = bal + amount;
		return balance;
	}
	
	public long withdraw(long bal, long amount) {
		long balance;
		if(bal <= amount) {
			return 0;
		} else {
			balance = bal - amount;
		}
		return balance;
	}
	
	public static void main(String[] args) {
		Bank b = new Bank();
		
		System.out.println(b.deposit(10000, 20));
		System.out.println(b.withdraw(10000, 20));
		System.out.println(b.withdraw(10000, 20000));
	}
}
