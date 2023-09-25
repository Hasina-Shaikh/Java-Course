/**
 * 
 */
package com.cornerstone.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


import com.cornerstone.entity.PhoneEntity;
import com.cornerstone.repository.PhoneRepository;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class PhoneController {

	
	@Autowired 
	PhoneRepository phoneRepository;
	
	@PostMapping("/saveData")
	public PhoneEntity saveData(@RequestBody PhoneEntity entity)
	{
		return phoneRepository.save(entity);
	}
	
	@PostMapping("/getData")
	public List<PhoneEntity> getData()
	{
		return phoneRepository.findAll();
	}
	
	@PostMapping("/saveDataInBulk")
	public List<PhoneEntity> saveDataInBulk(@RequestBody List<PhoneEntity> entity)
	{
		return phoneRepository.saveAll(entity);
	}	
	
	@PostMapping("/getData")
	public PhoneEntity getDataById(@RequestHeader long  Id)
	{	
		return (PhoneEntity) phoneRepository.findById((Id));
	}
}
