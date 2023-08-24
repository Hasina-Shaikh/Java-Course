/**
 * 
 */
package com.cornerstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cornerstone.entity.StudentEntity;
import com.cornerstone.service.EmployeeServiceImpl;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class StudentController {
	
	@Autowired
	EmployeeServiceImpl repository;

	@GetMapping("/getdata")
	public List<StudentEntity> getData() {
		return repository.getData();
	}
	@PostMapping("/savedata")
	public StudentEntity saveData(@RequestBody StudentEntity entity) {
		return repository.saveEmployeeData(entity);
	}
}
