/**
 * 
 */
package com.cornerstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cornerstone.entity.Employee;
import com.cornerstone.repository.EmployeeRepository;
import com.cornerstone.service.EmployeeServiceImpl;
import com.cornerstone.utility.RestApiHelper;

import lombok.extern.slf4j.Slf4j;

/**
 * @author muskanshaikh
 *
 */
@RestController
@Slf4j
public class HomeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	RestApiHelper apiHelper;

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		log.debug("Request Received from Application Postman " + employee.toString());
		employee.setId(employeeServiceImpl.getNextId());
		return employeeServiceImpl.saveEmployeeData(employee);
	}
	
	@GetMapping("/callexternalapi")
	public ResponseEntity<String> callAPI()
	{
		ResponseEntity<String> response = apiHelper.callApi();
		return response;
		//apiHelper.callApi();
	}

	@GetMapping("/callpostapi")
	public ResponseEntity<String> callPostAPI()
	{
		ResponseEntity<String> response = apiHelper.postAPI();
		return response;
		//apiHelper.callApi();
	}
}
