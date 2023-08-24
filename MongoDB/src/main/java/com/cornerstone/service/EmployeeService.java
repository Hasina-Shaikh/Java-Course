/**
 * 
 */
package com.cornerstone.service;

import org.springframework.stereotype.Service;

import com.cornerstone.entity.Employee;

/**
 * @author muskanshaikh
 *
 */
@Service
public interface EmployeeService {

	public Employee findByName(String name);

	public Employee saveEmployeeData(Employee employee);
	public Long getNextId();

}
