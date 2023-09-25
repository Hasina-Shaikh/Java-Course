/**
 * 
 */
package com.cornerstone;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class controller {

	@Autowired
	Repo repo;
	
	@PostMapping("/save")
	public entitydata saveTeamData(@RequestBody entitydata entitydata) {
		return repo.save(entitydata);
	}
	
	@PostMapping("/get")
	public List<entitydata> getTeamData(){
		return repo.findAll();
	}
	
	
	@PostMapping("/findbyname")
	public List<entitydata> findDataByName(@RequestHeader String Tname){
		return repo.findByTname(Tname);
	}
	
}
