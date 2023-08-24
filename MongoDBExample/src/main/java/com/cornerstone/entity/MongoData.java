/**
 * 
 */
package com.cornerstone.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author muskanshaikh
 *
 */

@Document("Student1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MongoData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollnu;
	private String Sname;
}

