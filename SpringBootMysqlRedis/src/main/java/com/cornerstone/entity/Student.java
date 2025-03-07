/**
 * 
 */
package com.cornerstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author muskanshaikh
 *
 */
@Data
@Entity
@Table(name = "Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String address;	
}
