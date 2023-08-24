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

import com.cornerstone.entity.EntityClass;
import com.cornerstone.services.CarServieImpl;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class CarController {

	@Autowired
	CarServieImpl carServieImpl;

	@GetMapping("/getcardata")
	public List<EntityClass> getCarData1() {
		return carServieImpl.getCarData();
	}

	@PostMapping("/savecardata")
	public EntityClass saveCarData1(@RequestBody EntityClass entityClass) {
		return carServieImpl.saveCarData(entityClass);
	}

	@PostMapping("/findbyname")
	public List<EntityClass> findByName(@RequestHeader String name)
	{
		System.out.println(name);
		return carServieImpl.getByName(name);
	}
	
	
}

