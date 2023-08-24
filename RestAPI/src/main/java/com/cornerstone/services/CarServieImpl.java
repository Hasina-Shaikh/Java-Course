/**
 * 
 */
package com.cornerstone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cornerstone.entity.EntityClass;
import com.cornerstone.repository.CarRepo;

/**
 * @author muskanshaikh
 *
 */
@Service
public class CarServieImpl implements CarService {
	
	@Autowired
	CarRepo carRepo;

	@Override
	public List<EntityClass> getCarData() {
		return carRepo.findAll();
	}

	@Override
	public EntityClass saveCarData(EntityClass entityClass) {
		return carRepo.save(entityClass);
	}

	public List<EntityClass> getByName(String name) {
		// TODO Auto-generated method stub
		return carRepo.findAll();
	}



}
