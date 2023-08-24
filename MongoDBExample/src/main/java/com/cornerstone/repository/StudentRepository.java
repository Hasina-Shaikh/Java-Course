/**
 * 
 */
package com.cornerstone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cornerstone.entity.MongoData;

/**
 * @author muskanshaikh
 *
 */
@Repository
public interface StudentRepository extends MongoRepository<MongoData, Long> {

}
