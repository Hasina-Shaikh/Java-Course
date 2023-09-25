/**
 * 
 */
package com.cornerstone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author muskanshaikh
 *
 */
@RestController
@Slf4j
public class LoggerController {

	@GetMapping("/checkLogger")
	public String checkLogger()
	{
	log.info("This is Info msg");
	log.debug("This is debug logger");
	for (int i =1 ; i< 1000;i++) {
		System.out.println(" "+ Math.random());
	}
	log.info("Method Execution Completed");
	return " ";
	}
	
}
