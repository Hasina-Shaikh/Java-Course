/**
 * 
 */
package com.org.conrnerstone.dto;

import org.springframework.stereotype.Component;

/**
 * @author muskanshaikh
 *
 */
@Component
public class EmployeeResponeDto {
	
	private int empid;
	private String empname;
	private String emailid;
	private boolean empstatus;
	private String mobileno;
	private int salary;
	private String address;
	
	public EmployeeResponeDto() {
		super();
	}
	public EmployeeResponeDto(int empid, String empname, String emailid, boolean empstatus, String mobileno, int salary,
			String address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emailid = emailid;
		this.empstatus = empstatus;
		this.mobileno = mobileno;
		this.salary = salary;
		this.address = address;
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
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public boolean isEmpstatus() {
		return empstatus;
	}
	public void setEmpstatus(boolean empstatus) {
		this.empstatus = empstatus;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeResponeDto [empid=" + empid + ", empname=" + empname + ", emailid=" + emailid + ", empstatus="
				+ empstatus + ", mobileno=" + mobileno + ", salary=" + salary + ", address=" + address + "]";
	}

	
}
