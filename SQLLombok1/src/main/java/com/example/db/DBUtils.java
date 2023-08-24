/**
 * 
 */
package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

/**
 * @author muskanshaikh
 *
 */
public class DBUtils {
	
	private static Connection connection = null;

	public static Connection getConnection() throws SQLException {
		if (connection != null) {
			return connection;
		} else {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/development";
			String username = "root";
			String password = "Muskan@6215#";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, username, password);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return connection;
	}
}
