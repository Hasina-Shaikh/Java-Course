/**
 * 
 */
package com.cornerstone.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cornerstone.entity.PhoneEntity;

/**
 * @author muskanshaikh
 *
 */
@Service
public interface PhoneServices {
		
	PhoneEntity saveData(PhoneEntity entity);
	List<PhoneEntity> getData();

}
