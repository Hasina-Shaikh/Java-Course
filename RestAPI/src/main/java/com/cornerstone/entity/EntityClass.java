/**
 * 
 */
package com.cornerstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author muskanshaikh
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Car")
public class EntityClass {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int car_num;
	private String car_name;
}
