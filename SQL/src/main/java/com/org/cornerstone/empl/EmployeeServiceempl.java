package com.org.cornerstone.empl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import com.org.cornerstone.DBUtil.DbUtil;
import com.org.cornerstone.model.Employee;
import com.org.cornerstone.service.EmployeeService;

@Service
public class EmployeeServiceempl implements EmployeeService{

	@Autowired
	static List<Employee> employeelist = new ArrayList();
	Connection connection;
	
	
	public EmployeeServiceempl() throws SQLException
	{
		connection = DbUtil.getConnection();
	}
	
	@Override
	public List<Employee> getEmployeeData() {
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from employee1");
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) 
			{
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

	
}
