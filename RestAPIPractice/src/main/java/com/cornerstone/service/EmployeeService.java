/**
 * 
 */
package com.cornerstone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cornerstone.entity.StudentEntity;

/**
 * @author muskanshaikh
 *
 */
@Service
public interface EmployeeService {

	public StudentEntity saveEmployeeData(StudentEntity entity);
	public List<StudentEntity> getData();
}
