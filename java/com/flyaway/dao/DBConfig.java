package com.flyaway.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConfig {

	public static Connection getConnection()
	{
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/flyawaydb";
		String username="root";
		String password="root";
		Connection conn=null;
		try {
			//load the driver
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
				
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}