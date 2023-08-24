/**
 * 
 */
package com.cornerstone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cornerstone.entity.MongoData;

/**
 * @author muskanshaikh
 *
 */
@Service
public interface StudentService {

	public List<MongoData> getData();
	public MongoData saveData(MongoData data);
}
