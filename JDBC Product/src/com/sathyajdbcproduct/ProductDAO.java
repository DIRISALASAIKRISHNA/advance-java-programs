package com.sathyajdbcproduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class ProductDAO {
	//create table
		 public void createTable() {
			 try(Connection connection=DBConnectionProduct.createConnection();
					 Statement statement=connection.createStatement()){
				statement.executeUpdate("create table product (proId number,proName varchar2(20),proPrice number)");
			 } 
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		//save method
		  public int save(ProductINFO pro) {
			//Declare the Resources
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			int count=0;
			try {
				//Get the connection
				 connection= DBConnectionProduct.createConnection();
				//Create the PS object
				preparedStatement=connection.prepareStatement("insert into product values(?,?,?)");
				//Read the data from pro object and set to parameters
				preparedStatement.setInt(1, pro.getProductId());
				preparedStatement.setString(2, pro.getProductName());
				preparedStatement.setDouble(3, pro.getProductPrice());
				count=preparedStatement.executeUpdate();
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			finally
			{
				//Before release connection check the connection present or not
				try{
					if(connection!=null)
				      connection.close();
				    if(preparedStatement!=null)
					  preparedStatement.close();
				}
				catch(SQLException e) {
				     e.printStackTrace();
			}
			
		   }
			return count;
	}
		//getProductById  method 
			public ProductINFO getProductById(int proId) 
			{
				ProductINFO product=null;
				
				
				try (Connection connection=DBConnectionProduct.createConnection(); PreparedStatement preparedStatement=connection.prepareStatement("select * from product where proId=?")){ 
					preparedStatement.setInt(1, proId);
					ResultSet resultSet=preparedStatement.executeQuery();
					if(resultSet.next())
					{
			            product=new ProductINFO();
						product.setProductId(resultSet.getInt(1));
						product.setProductName(resultSet.getString(2));
						product.setProductPrice(resultSet.getDouble(3));
					}
					
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			return product;	
			}
			
			
			
			//allProducts
			public <ProductINFO> List<ProductINFO> getAllProducts(){
				List<ProductINFO> pro=new ArrayList<ProductINFO>();
				try(Connection connection=DBConnectionProduct.createConnection(); Statement statement=connection.createStatement()){
					ResultSet resultSet=statement.executeQuery("select * from product");
					while(resultSet.next()) {
						ProductINFO product=new ProductINFO ();
						ProductDAO.setProId(resultSet.getInt(1));
						product.setProName(resultSet.getString(2));
						product.setProPrice(resultSet.getDouble(3));
						pro.add(product);
					}
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return pro ;	
				
			}
			
			private static void setProId(int int1) {
				// TODO Auto-generated method stub
				
			}






			//updatebyprice
			public int updateByPrice(int priceRange, int incrementPrice) {
				int count=0;
				try (Connection connection=DBConnectionProduct.createConnection(); PreparedStatement preparedStatement=connection.prepareStatement("update product set proPrice=proPrice+? where proPrice>?")){ 
					preparedStatement.setInt(1, incrementPrice);
					preparedStatement.setInt(2, priceRange);
					count=preparedStatement.executeUpdate();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
			    }
				return count;
			}
			
			
			//delete record using ID
			public int deleteById(int proId) {
				int count=0;
				try (Connection connection=DBConnectionProduct.createConnection(); PreparedStatement preparedStatement=connection.prepareStatement("delete product where proId=?")){ 
					preparedStatement.setDouble(1, proId);
					count=preparedStatement.executeUpdate();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
				return count;
			}
			
			
			//delete record by price
			public int deleteByPrice(double proPrice) {
				int count=0;
				try (Connection connection=DBConnectionProduct.createConnection(); PreparedStatement preparedStatement=connection.prepareStatement("delete product where proPrice>?")){ 
					preparedStatement.setDouble(1, proPrice);
					count=preparedStatement.executeUpdate();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
				return count;
			}
			
			
			//drop table
			public void dropTable() {
				try(Connection connection=DBConnectionProduct.createConnection(); Statement statement=connection.createStatement()){
					statement.executeUpdate("drop table product");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}