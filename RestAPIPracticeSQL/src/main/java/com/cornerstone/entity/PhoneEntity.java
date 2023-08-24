/**
 * 
 */
package com.cornerstone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author muskanshaikh
 *
 */
@Table(name= "Phone")
@Entity
@Data
public class PhoneEntity {
	
	@Id
	private Long cnum;
	private String cname;

}
