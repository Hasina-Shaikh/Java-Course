/**
 * 
 */
package com.cornerstone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cornerstone.entity.Data1;
import com.cornerstone.services.TvService;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class IndexControllers {

	@Autowired
	TvService service;
	
	@PostMapping("/savedata")
	public Data1 saveData(@RequestBody Data1 data1) {
		return service.saveData(data1);
	}
	
	@GetMapping("/getdata")
	public List<Data1> getData(){
		return service.data();
	}
	
	@PostMapping("/getbyname")
	public List<Data1> getByName(@RequestHeader String name){
		return service.getByName1(name);
	}
}
