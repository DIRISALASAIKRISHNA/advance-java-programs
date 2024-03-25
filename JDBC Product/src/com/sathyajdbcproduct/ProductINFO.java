package com.sathyajdbcproduct;

public class ProductINFO {
int productId;
String productName;
double productPrice;
public ProductINFO(int productId, String productName, double productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
	
	
}

	

public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
	
}

@Override
public String toString() {
	return "ProductINFO [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
			+ "]";
}



public ProductINFO() {
	super();
	// TODO Auto-generated constructor stub
}


}
