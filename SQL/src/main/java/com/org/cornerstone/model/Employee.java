/**
 * 
 */
package com.org.cornerstone.model;

/**
 * @author muskanshaikh
 *
 */

public class Employee {
	
	int ID;
	String Ename;
	String Number;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String d) {
		Number= d;
	}
	public Employee(int iD, String ename, String number) {
		super();
		ID = iD;
		Ename = ename;
		Number = number;
	}
	public Employee() {
		super();
		
	}
	@Override
	public String toString() {
		return "Employee [{\n + ID=" + ID + "\n, Ename=" + Ename + ", \n Number=" + Number + "\n]";
	}
	
}
