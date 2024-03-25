package com.sathya;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		
	//  step 1: Load the driver(it is automatically register in DriverManagerService)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loading process completed Successfully...."); 
		//goto buildpath and configure buid path &libraries& select location of "ojdbc6.jar"
	
		
		//step2 :create the connection
		
	Connection connection = DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","saikrishna","welcome");
	System.out.println("connection created successfully..."+connection );
	
	
	
	
	}
	
	

}
