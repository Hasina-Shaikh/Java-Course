/**
 * 
 */
package com.example.empl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.db.DBUtils;
import com.example.model.Employee;

/**
 * @author muskanshaikh
 *
 */
@Service
public class EmployeeServiceempl {

	@Autowired
	static List<Employee> employeelist = new ArrayList();
	Connection connection;

	public EmployeeServiceempl() throws SQLException {
		connection = DBUtils.getConnection();
	}

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
			e.printStackTrace();
		}

		return employeelist;
	}

}
