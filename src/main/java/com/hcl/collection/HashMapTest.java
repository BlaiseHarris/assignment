package com.hcl.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student1 {
	int stuId;
	String name;
	int stuSalary;
}
public class HashMapTest {
	public static void main(String[] args) {
		// Need concurrentHashMap to put and iter at the same time
		// because can only read or write at one time.
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		
		Map<Student1, Integer> stuMap = new TreeMap<Student1, Integer>((o1, o2)->(o1.getStuSalary()-o2.getStuSalary()));
		// Sorts the students by salary as added
		
		
//		Iterator<String> itr = map.keySet().iterator();
//		
//		while(itr.hasNext()) {
//			String key=itr.next();
//			System.out.println("Map Value: " + map.get(key));
//			if(key.equals("2")) {
//				map.put("4", "4");
//			}
//		}
		
		
	}
}
