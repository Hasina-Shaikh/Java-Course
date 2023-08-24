/**
 * 
 */
package com.cornerstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cornerstone.entity.PhoneEntity;

/**
 * @author muskanshaikh
 *
 */
@Repository
public interface PhoneRepository extends JpaRepository<PhoneEntity, Long> {

}
