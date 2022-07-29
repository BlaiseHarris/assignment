package com.hcl.thread;

public class ThreadEx1 extends Thread {
	public void run() {
		System.out.println("My thread is finished running.");
		System.out.println("My thread is finished.");
	}
	
	public static void main(String[] args) {
		ThreadEx1 t1 = new ThreadEx1();
		t1.start();
	}
}
