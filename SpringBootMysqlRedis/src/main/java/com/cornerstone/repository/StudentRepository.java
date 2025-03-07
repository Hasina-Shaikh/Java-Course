/**
 * 
 */
package com.cornerstone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cornerstone.entity.Student;

/**
 * @author muskanshaikh
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByName(String name);

	List<Student> findAllById(long id);
	
}
