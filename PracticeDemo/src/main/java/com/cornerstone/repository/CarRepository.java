/**
 * 
 */
package com.cornerstone.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cornerstone.entity.carEntity;

/**
 * @author muskanshaikh
 *
 */
@Repository
public interface CarRepository extends MongoRepository<carEntity, Long> {


}
