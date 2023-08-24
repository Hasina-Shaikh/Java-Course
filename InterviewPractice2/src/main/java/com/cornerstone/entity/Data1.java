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
@Table(name="TV")
public class Data1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int num;
	private String name;

}
