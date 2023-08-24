/**
 * 
 */
package com.cornerstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cornerstone.entity.Entity1;

/**
 * @author muskanshaikh
 *
 */
@Repository
public interface Repo extends JpaRepository<Entity1, Long>{

}
