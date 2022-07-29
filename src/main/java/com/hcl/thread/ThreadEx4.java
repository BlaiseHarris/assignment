package com.hcl.thread;

public class ThreadEx4 {
	public static void main(String[] args) {
		Runnable r1 = ()->{
			String threadName=Thread.currentThread().getName();
			System.out.println(threadName + "running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(threadName + " Done");
		};
		Thread t = new Thread(r1, "Saran Thread");
		t.start();
		Thread t1 = new Thread(r1, "Blaise Thread");
		t1.start();
		Thread t2 = new Thread(r1, "Chris Thread");
		t2.start();
	}
}
