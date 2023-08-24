/**
 * 
 */
package com.cornerstone.service;

import org.springframework.stereotype.Service;

import com.cornerstone.entity.carEntity;

/**
 * @author muskanshaikh
 *
 */
@Service
public interface CarService {

	public Long getNextId();
	
	public carEntity findByName(String name);

	public carEntity saveCarData(carEntity carEntity);

}
