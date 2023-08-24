/**
 * 
 */
package com.org.conrnerstone.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author muskanshaikh
 *
 */
@Component
@Data
public class EmployeeRequestDto {

	private int empid;
	private String empname;
	private String emailid;
	private boolean empstatus;
	private String mobileno;
}
