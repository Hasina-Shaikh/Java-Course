/**
 * 
 */
package com.cornerstone.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cornerstone.entities.EmployeeEntity;
import com.cornerstone.repositories.EmployeeReposiory;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeReposiory employeeReposiory;

	@GetMapping("/getdata")
	public List<EmployeeEntity> getEmpDetails(){
		return employeeReposiory.findAll();	
		}
	
	@PostMapping("/putdata")
	public EmployeeEntity putEmpDetails(@RequestBody EmployeeEntity employeeEntity)
	{
		return employeeReposiory.save(employeeEntity);
	}
	@PostMapping("/addempbulk")
	public List<EmployeeEntity> putEmpDetailsbulk(@RequestBody List<EmployeeEntity> employeeEntity)
	{
		return employeeReposiory.saveAll(employeeEntity);
	}
	
	@PostMapping("/findselectedemp")
	public Optional<EmployeeEntity> getempselected(@RequestHeader String id)
	{
		return employeeReposiory.findById((long) Integer.parseInt(id));
	}

	@PostMapping("/deleteempselected")
	public void  deleteempselected(@RequestHeader long id)
	{
		employeeReposiory.deleteById(id);
		
	}
	
	@GetMapping("/getdatabycity")
	public List<EmployeeEntity> getEmpByCity(@RequestHeader String city){
		//return employeeReposiory.findAll();	
		return employeeReposiory.findByCity(city);
	}
	
}

