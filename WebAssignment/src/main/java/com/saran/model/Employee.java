package com.saran.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//MODEL->POJO and your business logic
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int age;	
}
