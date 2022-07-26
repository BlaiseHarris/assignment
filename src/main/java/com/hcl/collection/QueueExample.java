package com.hcl.collection;

import java.util.PriorityQueue;

public class QueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10; i>0; i--) {
			queue.add(i);
		}
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.peek());
		queue.poll();
		System.out.println("The size of the queue: " + queue.size());
	}
	
}

