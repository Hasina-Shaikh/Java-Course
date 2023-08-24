/**
 * 
 */
package com.cornerstone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author muskanshaikh
 *
 */
//logger info
@Slf4j  
@RestController
public class LoggerControllers {
	
	@GetMapping("/checklogger")
	public String checklogger() {
		log.info("inside the checklooger Method");
		log.debug("This is debug logger");
		log.warn("This is warning logger");
		log.error("This is error logger");
		for (int i = 0; i < 100000; i++) {
			log.debug("Random Number is " + Math.random());
		}
		log.info("Method Execution Completed");
		return "";
	}
}
