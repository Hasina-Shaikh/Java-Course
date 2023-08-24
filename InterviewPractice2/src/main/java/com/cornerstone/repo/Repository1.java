/**
 * 
 */
package com.cornerstone.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cornerstone.entity.Data1;

/**
 * @author muskanshaikh
 *
 */
@Repository
public interface Repository1 extends JpaRepository<Data1, Long> {

	List<Data1> getByName(String name);
}
