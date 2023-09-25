/**
 * 
 */
package com.cornerstone.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cornerstone.entity.Data1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author muskanshaikh
 *
 */
@RestController
@Slf4j
public class DataControllers {

	@GetMapping("/getdata")
	public Data1 getData()
	{
	log.info("Details of Member");
	Data1 data1 = new Data1();
	data1.setName("Muskan");
	data1.setAddress("Yewalewadi");
	data1.setMobileNo("7378366215");
	return data1;
	}
	
//	@GetMapping("/checklogger")
//	public String checklogger() {
//		log.info("inside the checklooger Method");
//		log.debug("This is debug logger");
//		log.warn("This is warning logger");
//		log.error("This is error logger");
//		for (int i = 0; i < 100000; i++) {
//			log.debug("Random Number is " + Math.random());
//		}
//		log.info("Method Execution Completed");
//		return "";
//	}
	
}