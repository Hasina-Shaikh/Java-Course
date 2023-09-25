/**
 * 
 */
package com.cornerstone.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cornerstone.EntityData.DataEntity;

/**
 * @author muskanshaikh
 *
 */

@RestController
public class SaveData {
	
	@PostMapping("/saveData")
	public DataEntity getData(@RequestBody DataEntity de)
	{
		DataEntity dataEntity = new DataEntity();
		dataEntity.setId(de.getId());
		dataEntity.setName(de.getName());
		return dataEntity;
		
	}

}
