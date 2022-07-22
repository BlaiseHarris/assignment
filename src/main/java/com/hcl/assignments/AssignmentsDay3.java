package com.hcl.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class AssignmentsDay3 {
	
	public static void reverseArray() {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("The list: " + list);
		List<Integer> temp = new ArrayList<>();
		ListIterator<Integer> itr = list.listIterator(list.size());
		while(itr.hasPrevious()) {
			temp.add(itr.previous());
		}
		
		System.out.println("Reversed list: " + temp);
	}
	
	public static void swapElement() {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("The list: " + list);
		Collections.swap(list, 0, 3);
		
		System.out.println("Swapped list (Swapped index 0 with index 3): " + list);
	}
	
	public static void iterateLinkedList(int index) {
		List<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		
		System.out.println("The list: " + list);
		int count = 0;
		Iterator<Integer> itr = list.iterator();
		List<Integer> temp = new LinkedList<>();
		while(count < index) {
			if(itr.hasNext()) { // Yep harder to search
				itr.next();
			}
			count++;
		}
		while(itr.hasNext()) {
			temp.add(itr.next());
		}
		
		System.out.println("linked list iterated from index: " + temp);
	}
	
	public static void hashSetToArray() {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		
		System.out.println("The HashSet: " + set);
		int count = 0;
		Integer[] temp = new Integer[set.size()];
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			temp[count] = itr.next();
			count++;
		}
		
		System.out.println("Proof of change: " + Arrays.toString(temp));
	}
	
	public static void replaceElementLinkedList(int index, int e) {
		List<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		
		System.out.println("The list: " + list);
		list.set(index, e);
		System.out.println("Linked list replace: " + list);
	}
	
	
	public static void main(String[] args) {
		reverseArray();
		swapElement();
		iterateLinkedList(2);
		hashSetToArray();
		replaceElementLinkedList(2, 7);
	}
}
