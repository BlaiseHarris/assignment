package com.blaise.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blaise.model.Employee;
import com.blaise.repo.EmployeeRepository;
import com.blaise.service.EmployeeService;

@RestController
public class BlaiseController {

	@Autowired
	private EmployeeService service;
	@GetMapping("/employees")
	public List<Employee> listAllEmp() {
		return service.getAllEmps();
	}
	
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmpId(@PathVariable Integer id) {
		Optional<Employee> emp = service.getEmpById(id);
		return service.getEmpById(id);
	}
	
	@PostMapping("/employees")
	public void addEmp(@RequestBody Employee emp) {
		System.out.println(emp);
		service.addEmp(emp);
	}
	
	@DeleteMapping("/employees")
	public void deleteEmp(@RequestBody Integer id) {
		service.deleteEmp(id);
	}
	
	@PutMapping("/employees/replace/{id}")
	  public void replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Integer id) {
	    service.updateEmp(id, newEmployee);
	  }
}
