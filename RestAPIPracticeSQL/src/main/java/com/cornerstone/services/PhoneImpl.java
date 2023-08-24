/**
 * 
 */
package com.cornerstone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cornerstone.entity.PhoneEntity;
import com.cornerstone.repository.PhoneRepository;

/**
 * @author muskanshaikh
 *
 */
@Service
public class PhoneImpl  implements PhoneServices{
	
	@Autowired
	PhoneRepository phoneRepository;

	@Override
	public PhoneEntity saveData(PhoneEntity entity) {
		// TODO Auto-generated method stub
		return phoneRepository.save(entity);
	}

	@Override
	public List<PhoneEntity> getData() {
		return phoneRepository.findAll();
	}

}
