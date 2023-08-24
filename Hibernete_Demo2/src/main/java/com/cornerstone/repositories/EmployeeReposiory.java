package com.cornerstone.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cornerstone.entities.EmployeeEntity;

@Repository
public interface EmployeeReposiory extends JpaRepository<EmployeeEntity, Long> {

	List<EmployeeEntity> findByCity(String city);
}
