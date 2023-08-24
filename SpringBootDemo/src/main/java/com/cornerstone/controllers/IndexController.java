/**
 * 
 */
package com.cornerstone.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class IndexController {

	@GetMapping("/gettingdata")
	public String getData()
	{
		return "Hello, This is get mapping data";
	}
}
