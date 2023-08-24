/**
 * 
 */
package com.org.cornerstone.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author muskanshaikh
 *
 */
@Data
@ComponentScan
@Component
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Employee {
	
	int ID;
	String Ename;
	String Number;
}
