/**
 * 
 */
package com.org.cornerstone.dto1;

import java.sql.Connection;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author muskanshaikh
 *
 */
@Component
public class EmpResponseDto {
	
	public int empid;
	public String empname;
	public String emailid;
	public EmpResponseDto() {
		super();
	}
	public EmpResponseDto(int empid, String empname, String emailid) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emailid = emailid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String string) {
		this.emailid = string;
	}
	@Override
	public String toString() {
		return "EmpResponseDto [empid=" + empid + ", empname=" + empname + ", emailid=" + emailid + "]";
	}
	
	
}
