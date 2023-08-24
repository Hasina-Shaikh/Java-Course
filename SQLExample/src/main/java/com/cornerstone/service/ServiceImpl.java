/**
 * 
 */
package com.cornerstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cornerstone.entity.Entity1;
import com.cornerstone.repository.Repo;

/**
 * @author muskanshaikh
 *
 */
@Service
public class ServiceImpl implements ServiceInterface {
	
	@Autowired
	Repo repo;

	@Override
	public Entity1 saveData(Entity1 entity1) {
		return repo.save(entity1);
	}

	@Override
	public List<Entity1> getData() {
		return repo.findAll();
	}

}
