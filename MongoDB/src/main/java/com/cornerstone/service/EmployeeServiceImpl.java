/**
 * 
 */
package com.cornerstone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cornerstone.entity.Employee;
import com.cornerstone.repository.EmployeeRepository;

/**
 * @author muskanshaikh
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee findByName(String name) {
		return null;
//		return employeeRepository.save(null);
	}

	@Override
	public Employee saveEmployeeData(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Long getNextId() {
		return employeeRepository.count()+1;
	}
	
	

}
