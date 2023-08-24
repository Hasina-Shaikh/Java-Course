/**
 * 
 */
package com.org.cornerstone.employeeservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author muskanshaikh
 *
 */

@Component

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Employee {

	@Autowired
	static List<Employee> employeelist = new ArrayList();
	Connection connection;
	/*
	 * public Employee() throws SQLException { connection = DbUtil.getConnection();
	 * }
	 */

	public List<Employee> getEmployeeData() {

		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from employee1");
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setID(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setNumber(rs.getString(3));
				employeelist.add(emp);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return employeelist;
	}

	private void setID(int int1) {
		// TODO Auto-generated method stub

	}

	private void setEname(String string) {
		// TODO Auto-generated method stub

	}

	private void setNumber(String string) {
		// TODO Auto-generated method stub

	}

}
