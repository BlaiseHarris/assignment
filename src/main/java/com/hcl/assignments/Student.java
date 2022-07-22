package com.hcl.assignments;

import java.util.Arrays;

public class Student {
	
	private String name;
	private long[] scores = new long[3];
	
	Student() {
		this.name=null;
	}
	
	public String studentName(String name) {
		this.name = name;
		return name;
	}

	public String average(long exam1, long exam2, long exam3) {
		
		this.scores[0] = exam1;
		this.scores[1] = exam2;
		this.scores[2] = exam3;
		
		double average = (exam1 + exam2 + exam3) / 3;
		
		if(average > 50) {
			return "Pass";
		}
		else {
			return "Failed";
		}
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", scores=" + Arrays.toString(scores) + "]";
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		
		System.out.println(s.studentName("Bill"));
		System.out.println(s.average(98, 74, 92));
		System.out.println(s.toString());
	}
}
