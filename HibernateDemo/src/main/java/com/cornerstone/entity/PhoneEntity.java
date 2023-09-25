/**
 * 
 */
package com.cornerstone.entity;

import javax.persistence.Column;
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
@Table(name = "PhoneNew")
@Data
@Entity
public class PhoneEntity {

	@Id
	@Column(name= "PhoneId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long Id;
	
	@Column(name = "Phone_Name")
	public String pname;
}
