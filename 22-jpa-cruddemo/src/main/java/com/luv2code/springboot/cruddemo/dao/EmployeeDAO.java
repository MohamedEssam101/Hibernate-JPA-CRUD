package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {

	// return list of employees
	public List<Employee> findAll();

	// find employee by id
	public Employee findById(int theId);

	// save an employee by
	public void save(Employee theEmployee);

	// delete employee by id
	public void deleteById(int theId);
}
