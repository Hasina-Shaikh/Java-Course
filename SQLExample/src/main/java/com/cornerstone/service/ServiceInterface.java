/**
 * 
 */
package com.cornerstone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cornerstone.entity.Entity1;

/**
 * @author muskanshaikh
 *
 */
@Service
public interface ServiceInterface {

	public Entity1 saveData(Entity1 entity1);
	public List<Entity1> getData();
}
