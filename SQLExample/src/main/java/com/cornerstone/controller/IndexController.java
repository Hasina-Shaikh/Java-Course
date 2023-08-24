/**
 * 
 */
package com.cornerstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cornerstone.entity.Entity1;
import com.cornerstone.service.ServiceImpl;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class IndexController {

	@Autowired
	ServiceImpl impl;
	
	@PostMapping("/save")
	public Entity1 saveData1(@RequestBody Entity1 entity1) {
		return impl.saveData(entity1);
	}
}
