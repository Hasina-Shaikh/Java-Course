/**
 * 
 */
package com.cornerstone.entities;

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

@Table(name = "Employee1")
@Entity
@Data
public class EmployeeEntity {

	@Id   // Unique Identifier
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long ID;

	@Column(name = "Name")
	public String Ename;

	@Column(name = "Address")
	public String Address;

	@Column(name = "city")
	public String city;

}
