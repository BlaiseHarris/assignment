package com.hcl.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {
	int empId;
	String name;
	int age;
	String gender;
	String dept;
	int yearOfJoining;
	int salary;
}

public class EmployeeSortTest {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "John", 21, "Male", "Maintenance Department", 2020, 55000));
		list.add(new Employee(2, "Sara", 28, "Female", "Finance Department", 2021, 86000));
		list.add(new Employee(3, "Lexi", 41, "Female", "Maintenance Department", 2018, 62000));
		list.add(new Employee(6, "Jonny", 30, "Male", "HR Department", 2013, 75000));
		list.add(new Employee(4, "Bob", 52, "Male", "HR Department", 2018, 91000));
		
		System.out.println("Female count: " + (int)list.stream().filter(item->item.getGender().toLowerCase().equals("female")).count());
		System.out.println("Male count: " + (int)list.stream().filter(item->item.getGender().toLowerCase().equals("male")).count() + "\n");
		
		System.out.println("Average Age: " + list.stream().collect(Collectors.averagingInt(item->item.getAge())));
		
		System.out.println("Getting the max salary: " + list.stream().max((o1, o2) -> (o1.getSalary()-o2.getSalary())) + "\n");
		
		System.out.println("Year of joining before 2015: " + Arrays.toString(list.stream().filter(item->item.getYearOfJoining() < 2015).toArray()) + "\n");
		
		System.out.println("Oldest Employee: " + list.stream().max((o1, o2) -> (o1.getAge()-o2.getAge())) + "\n");
		
		System.out.println("Maintence Department workers: " + list.stream().filter(item->item.getDept().toLowerCase().equals("hr department")).count());
		System.out.println("HR Department workers: " + list.stream().filter(item->item.getDept().toLowerCase().equals("maintenance department")).count());
		System.out.println("Finance Department workers: " + list.stream().filter(item->item.getDept().toLowerCase().equals("finance department")).count() + "\n");
		
		System.out.println("People that work in Maintenance: " + Arrays.toString(list.stream().filter(item->item.getDept().toLowerCase().equals("maintenance department")).toArray()) + "\n");
		
		System.out.println("Average Salary: " + list.stream().collect(Collectors.averagingInt(item->item.getSalary())) + "\n");
		
		System.out.println("Employees between 25 and 30(inclusive): " + Arrays.toString(list.stream().filter(item->item.getAge() <= 30 && item.getAge() > 25).toArray()) + "\n");
		
		list.sort((o1, o2) -> o1.getDept().compareTo(o2.getDept()));
		System.out.println("All employees sorted by department: " + list);
	}
}
