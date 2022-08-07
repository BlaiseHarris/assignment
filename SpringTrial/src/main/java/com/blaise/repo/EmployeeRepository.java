package com.blaise.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blaise.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
