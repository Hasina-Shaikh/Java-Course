/**
 * 
 */
package com.cornerstone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cornerstone.entity.carEntity;
import com.cornerstone.repository.CarRepository;

/**
 * @author muskanshaikh
 *
 */
@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarRepository carRepositoryl;
	
	@Override
	public carEntity findByName(String name) {
		return null;
	//return carRepositoryl.save(name);
	}

	public carEntity saveCarData(carEntity carEntity) {
		return carRepositoryl.save(carEntity);
	}

	@Override
	public Long getNextId() {
		// TODO Auto-generated method stub
		return carRepositoryl.count()+1;
	}

	public void deleteByID(long id) {
		carRepositoryl.deleteById(id);
	}
	
	
	
}
