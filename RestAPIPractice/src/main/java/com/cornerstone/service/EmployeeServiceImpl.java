/**
 * 
 */
package com.cornerstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cornerstone.entity.StudentEntity;
import com.cornerstone.repository.StudentRepository;

/**
 * @author muskanshaikh
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	StudentRepository stuRepository;

	@Override
	public StudentEntity saveEmployeeData(StudentEntity employee) {
		return stuRepository.save(employee);
	}


	@Override
	public List<StudentEntity> getData() {
		return stuRepository.findAll();
	}
	
	

}
