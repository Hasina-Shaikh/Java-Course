/**
 * 
 */
package com.cornerstone.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author muskanshaikh
 *
 */
@Document("Car")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class carEntity {

	@Id
	private Long carId;
	private String carName;
}
