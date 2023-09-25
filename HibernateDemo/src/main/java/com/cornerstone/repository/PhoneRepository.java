/**
 * 
 */
package com.cornerstone.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.cornerstone.entity.PhoneEntity;


/**
 * @author muskanshaikh
 *
 */
@Repository
public interface PhoneRepository extends JpaRepository<PhoneEntity, Long>  {

	
	List<PhoneEntity> findById(long Id);
	}

