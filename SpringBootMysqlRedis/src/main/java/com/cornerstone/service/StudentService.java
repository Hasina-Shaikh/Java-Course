/**
 * 
 */
package com.cornerstone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cornerstone.entity.Student;

/**
 * @author muskanshaikh
 *
 */
@Service
public interface StudentService {
	
	public Student saveStudentData(Student student);
	public List<Student> getAllData();
	public List<Student> getByName(String name);
	public List<Student> getById(Long id);

}
