/**
 * 
 */
package com.cornerstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cornerstone.entity.Student;
import com.cornerstone.repository.StudentRepository;

/**
 * @author muskanshaikh
 *
 */
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository repository;

	@Override
	public Student saveStudentData(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public List<Student> getAllData() {
		// TODO Auto-generated method stub
		System.out.println(repository.count());
		
		return repository.findAll();
	}

	@Override
	public List<Student> getByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}

	@Override
	public List<Student> getById(Long id) {
		// TODO Auto-generated method stub
		return repository.findAllById(id);
	}
}
