/**
 * 
 */
package com.cornerstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cornerstone.entity.carEntity;
import com.cornerstone.repository.CarRepository;
import com.cornerstone.service.CarServiceImpl;

import lombok.extern.slf4j.Slf4j;

/**
 * @author muskanshaikh
 *
 */
@RestController
@Slf4j
public class CarController {
	
	@Autowired
	CarServiceImpl carServiceImpl;

	@Autowired
	CarRepository carRepository;

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@PostMapping("/addemployee")
	public carEntity addEmployee(@RequestBody carEntity carEntity) {
		log.debug("Request Received from Application Postman " + carEntity.toString());
		carEntity.setCarId(carServiceImpl.getNextId());
		return carServiceImpl.saveCarData(carEntity);
	
	}
	@PostMapping("/deleted")
	public void deleteByID(@RequestBody long carId) {
		 carServiceImpl.deleteByID(carId);
	}
//	
//	@PostMapping("/findByName")
//	public carEntity findByName(@RequestBody String carName) {
//		return carServiceImpl.findByName(carName);
//	}
}

