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

import com.cornerstone.entity.PhoneEntity;
import com.cornerstone.services.PhoneImpl;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class PhoneController {
	
	@Autowired 
	PhoneImpl impl;
	
	@PostMapping("/savedata")
	public PhoneEntity saveData1(@RequestBody PhoneEntity entity) {
		return impl.saveData(entity);
	}
	
	@GetMapping("/getdata")
	public List<PhoneEntity> getData1(){
		return impl.getData();
	}

}
