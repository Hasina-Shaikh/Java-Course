/**
 * 
 */
package com.org.cornerstone.dto1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author muskanshaikh
 *
 */
@Component
public class EmpRequestDto {
		public String empid;
		public String empname;
		
		private static Connection connection = null;
		
		public static Connection getConnection() throws SQLException{
			if (connection != null) {
				return connection;
			}
			else {
				String driver = "com.mysql.cj.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/development";
				String uname = "root";
				String password = "Muskan@6215#";
				
				try {
					Class.forName(driver);
					connection= DriverManager.getConnection(url,uname,password);
					
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			return connection;
			}
		
		public EmpResponseDto getData() {
			
			try {
				PreparedStatement preparedStatement = connection.prepareStatement("select * from employee");
				ResultSet rs = preparedStatement.executeQuery();
				while(rs.next())
				{
					EmpResponseDto erd = new EmpResponseDto();
					erd.setEmailid(rs.getString(empid));
					erd.setEmpname(rs.getString(empname));
					return erd;
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		}
		
