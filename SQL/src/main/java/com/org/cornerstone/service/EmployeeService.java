package com.org.cornerstone.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.org.cornerstone.model.Employee;

@Repository
public interface EmployeeService {
	
	public List<Employee> getEmployeeData();

}
