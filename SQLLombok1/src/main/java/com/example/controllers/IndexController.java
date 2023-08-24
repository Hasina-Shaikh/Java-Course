/**
 * 
 */
package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empl.EmployeeServiceempl;
import com.example.model.Employee;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class IndexController {

	@Autowired
	private EmployeeServiceempl employeeService;

	@GetMapping("/get")
	public List<Employee> getEmployees() {
		return this.employeeService.getEmployeeData();
	}

	@PostMapping("/post")
	public List<Employee> getEmployees1() {
		return this.employeeService.getEmployeeData();
	}

}
