package com.org.cornerstoen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.cornerstone.model.Employee;
import com.org.cornerstone.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/get")
	public List<Employee> getEmployees() {
		return this.employeeService.getEmployeeData();
	}
	
	@PostMapping("/post")
	public List<Employee> getEmployees1() {
		return this.employeeService.getEmployeeData();
	}
}
