package com.hcl.thread;

public class ThreadEx2 implements Runnable{

	@Override
	public void run() {
		System.out.println("My thread is finished running.");
		System.out.println("My thread is finished.");
	}
	
	public static void main(String[] args) {
		ThreadEx2 t1 = new ThreadEx2();
		Thread tt = new Thread();
		
		tt.start();
	}

}
