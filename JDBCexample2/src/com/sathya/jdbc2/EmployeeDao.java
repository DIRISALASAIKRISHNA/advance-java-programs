package com.sathya.jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {
	public int save(EmployeeInfo emp)
	{
		//DECLARE THE RESOURCES
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		int count=0;
		try
		{
			//GET THE CONNECTION
			connection=DBconnection.createConnection();
			//CREATE PS OBJECT
			preparedStatement=connection.prepareStatement("insert into emp values(?,?,?");
			//READ THE DATA FROM EMP OBJECT AND SET TO PARAMETERS
			
			preparedStatement.setInt(1,emp.empID);
			preparedStatement.setString(2,emp.empName);
			preparedStatement.setDouble(3,emp.Salary);
			
			count = preparedStatement.executeUpdate();
					
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		finally
		{
			try
			{
				if(connection!=null)
				{
					connection.close();
					
				}
				if(preparedStatement!=null)
				{
					preparedStatement.close();
					
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				
			}
		}
		return count;
		
		public Employee findById(int empID);
		{
			//try with resource : once the try Block is completed the resources automatically closed completed the resources automatically closed
			
			try(Connection connection = DBconnection.createConnection();
			{
				connection=DBconnection.createConnection();
				PreparedStatement preparedStatement=("Select * from emp where empid=?");
				
			}
			
						
					
					
	    }

}
