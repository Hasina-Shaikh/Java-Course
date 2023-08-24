/**
 * 
 */
package com.cornerstone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cornerstone.entity.Data1;
import com.cornerstone.repo.Repository1;

/**
 * @author muskanshaikh
 *
 */
@Service
public class TvService {

	@Autowired
	Repository1 repository1;
	
	public Data1 saveData(@RequestBody Data1 data1) {
		return repository1.save(data1);	
	} 

	public List<Data1> data() {
		return repository1.findAll();	
	} 
	
	public List<Data1> getByName1(String name){
		return repository1.getByName(name);
	}

}
