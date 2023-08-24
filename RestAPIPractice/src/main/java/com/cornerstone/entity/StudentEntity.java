/**
 * 
 */
package com.cornerstone.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author muskanshaikh
 *
 *
 */
@Data
@Document("Student")
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
	
	@Id
	private long id;
	private String name;
	private String city;
}




