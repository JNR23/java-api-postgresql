package com.dev.employee.service;

import java.util.List;
import java.util.Optional;

import com.dev.employee.entity.Employee;

public interface EmployeeService {
	List<Employee> findAllEmployee();
	Optional<Employee> findById(Long id);
	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	void deleteEmployee(Long id);

}