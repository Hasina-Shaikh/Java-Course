/**
 * 
 */
package com.cornerstone.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author muskanshaikh
 *
 */
@Document("Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	private long id;
	private String name;
	private String city;

}
