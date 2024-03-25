package com.sathya.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLRecoverableException;


public class DBconnection {
	public static Connection createConnection()
	{
		Connection connection=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","saikrishna","welcome");
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
		
		
			e.printStackTrace();
			
		}
		return connection;
		
	}
	
	

}
