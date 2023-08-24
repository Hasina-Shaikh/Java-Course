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

import com.cornerstone.entity.MongoData;
import com.cornerstone.service.StudentServiceImpl;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class StudentController {
	
	@Autowired
	StudentServiceImpl impl;
	
	@PostMapping("/save")
	public MongoData saveData(@RequestBody MongoData mongoData) {
		return impl.saveData(mongoData);
	}
	
	
	@GetMapping("/getdata")
	public List<MongoData> getData() {
		return impl.getData();
	}
	
}
