/**
 * 
 */
package com.cornerstone.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cornerstone.entity.Home;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class HomeComtroller {

	@PostMapping("/")
	public Home getData(@RequestBody Home home1) {
		Home home = new Home();
		home.setId(home1.getId());
		home.setName("Sahil");
		return home;
	}
}
