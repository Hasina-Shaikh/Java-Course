/**
 * 
 */
package com.cornerstone.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cornerstone.entity.EntityClass;

/**
 * @author muskanshaikh
 *
 */
@Service
public interface CarService {

	public List<EntityClass> getCarData();
	public EntityClass saveCarData(EntityClass entityClass);


}
