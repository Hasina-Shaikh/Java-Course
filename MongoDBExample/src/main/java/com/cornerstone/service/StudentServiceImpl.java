/**
 * 
 */
package com.cornerstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cornerstone.entity.MongoData;
import com.cornerstone.repository.StudentRepository;

/**
 * @author muskanshaikh
 *
 */
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository repository;

	@Override
	public List<MongoData> getData() {
		return repository.findAll();
		
	}

	@Override
	public MongoData saveData(@RequestBody MongoData data) {
		return repository.save(data);
	}

}
