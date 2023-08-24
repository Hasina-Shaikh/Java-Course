package com.org.cornerstone.service;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeService {
	
	public List<com.example.model.Employee> getEmployeeData();
}
