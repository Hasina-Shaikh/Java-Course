/**
 * 
 */
package com.cornerstone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cornerstone.entity.EntityClass;

/**
 * @author muskanshaikh
 *
 */
@Repository
public interface CarRepo extends JpaRepository<EntityClass, Long>{
 
	
}
