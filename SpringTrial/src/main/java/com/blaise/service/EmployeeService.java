package com.blaise.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blaise.model.Employee;
import com.blaise.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;

	public List<Employee> getAllEmps() {
		return repo.findAll();
	}

	public Optional<Employee> getEmpById(int id) {
		return repo.findById(id);
	}

	public void deleteEmp(Integer id) {
		repo.deleteById(id);
	}

	public void addEmp(Employee emp) {
		Employee empl = emp;
		empl.setName(emp.getName());
		empl.setDesignation(emp.getDesignation());
		empl.setSalary(emp.getSalary());
		repo.save(empl);
	}

	public void updateEmp(Integer id, Employee empl) {
		Employee emp = repo.findById(id).get();
		emp.setName(empl.getName());
		emp.setDesignation(empl.getDesignation());
		emp.setSalary(empl.getSalary());
		repo.save(emp);
	}
}
