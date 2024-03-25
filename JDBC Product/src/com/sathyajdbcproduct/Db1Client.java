package com.sathyajdbcproduct;

public class Db1Client {
	public static void main(String[] args) 
	{
       ProductDAO productDao=new ProductDAO();
		
       
       //table creation
       productDao.createTable();
       System.out.println("Table created successfully");
		
		//save method calling
		int res1=ProductDAO.save(new ProductINFO(1001,"AC",10000));
		System.out.println("data inserted successfully"+res1);
		int res2=productDao.save(new ProductINFO(1002,"Oven",20000));
		System.out.println("data inserted successfully"+res2);
       
       //get product by id
       ProductINFO p=productDao.getproductById(1001);
       System.out.println(p);
       
       //get all products
       List<Product> pro=productDao.getAllProducts();
       pro.forEach(prod->System.out.println(prod));
       
       
       //updateprice
       int res=productDao.updateByPrice(500, 9000);
       System.out.println(res+" rows updated");
       
       //delete record
       int res1=productDao.deleteById(1002);
       System.out.println(res1+" rows deleted");
       
       //delete record by salary
       int res2=productDao.deleteByPrice(20000);
       System.out.println(res2+"rows deleted");
       
       //droptable
       productDao.dropTable();
       System.out.println("Table Dropped");
		
		
		
		
		
	}

}

}
