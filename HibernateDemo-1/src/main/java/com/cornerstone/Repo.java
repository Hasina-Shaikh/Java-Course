package com.cornerstone;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface Repo extends JpaRepository<entitydata, Long> {

	List<entitydata> findByTname(String Tname);
}
