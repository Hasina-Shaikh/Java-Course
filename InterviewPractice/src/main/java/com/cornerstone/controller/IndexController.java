/**
 * 
 */
package com.cornerstone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cornerstone.entity.EntityData;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class IndexController {

	@PostMapping("/setdata")
	public EntityData getData(@RequestBody EntityData data) {
		EntityData data1 = new EntityData();
		data1.setId(data.getId());
		data1.setName("Muskan");
		return data1;
}
	@GetMapping("/getdata")
	public EntityData getData1(EntityData data) {
	  
	
		data.setId(1);
		data.setName("Muskan");
		return data;
	
	}
}
