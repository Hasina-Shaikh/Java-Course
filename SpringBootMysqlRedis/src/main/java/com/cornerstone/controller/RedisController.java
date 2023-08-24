/**
 * 
 */
package com.cornerstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cornerstone.entity.Student;
import com.cornerstone.service.StudentServiceImpl;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class RedisController {
	

	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@GetMapping("/studentdata")
	public List<Student> getStudentData()
	{
		return studentServiceImpl.getAllData();
	}
	
	@PostMapping("/savestudentdata")
	public Student saveData(@RequestBody Student student)
	{
		return studentServiceImpl.saveStudentData(student);
	}
	
	@PostMapping("/findbyname")
	public List<Student> findByName(@RequestHeader String name)
	{
		System.out.println(name);
		return studentServiceImpl.getByName(name);
	}
	@PostMapping("/findbyid")
	public List<Student> findById(@RequestHeader Long id)
	{
		//System.out.println(name);
		return studentServiceImpl.getById(id);
	}
	
}
