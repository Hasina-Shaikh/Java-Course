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
@Entity
@Data
@Table(name = "Account")
public class Entity1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long AccountId;
	private String AccName;
}
