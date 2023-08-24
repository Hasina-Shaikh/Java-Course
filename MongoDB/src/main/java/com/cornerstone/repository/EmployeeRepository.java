/**
 * 
 */
package com.cornerstone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cornerstone.entity.Employee;

/**
 * @author muskanshaikh
 *
 */
@Repository 
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}
