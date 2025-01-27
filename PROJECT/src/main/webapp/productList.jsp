
<%@page import="com.sathya.servlet.ProjectDao"%>
<%@page import="com.sathya.servlet.product"%>
<%@ page language="java" contentType="text/html " import="java.util.Base64"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Product List</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<h1 align=center>LIST OF AVAILABLE PRODUCTS</h1>
<body>
<h1 class="text-center text-success">LIST OF AVAILABLE PRODUCTS </h1>
 <div>

 <a class="btn btn-success" href="add-product.html">Add Product</a>

 </div>
 
 <div>
 <input type="text" placeholder="Search...">
 </div>
 
 <div>
 <c:if test="$(saveResult==1}"><h1 class="text-center text-success">Data inserted successfully...</h1></c:if>
 </div>

 <div>
 <c:if test="${deleteresult==1}"><h1 class="text-center text-success">Data deleted successfully...</h1></c:if> I
</div> 

<div>
<c:if test="${deleteresult==0}"><h1 class="text-center text-danger">Data deleted fail...</h1></c:if> I
</div>


<table class="table table-bordered table-striped">
<thead class="thead-dark">
       <tr>
           <th>ProductID</th>
           <th>ProductName</th>
           <th>ProductCost</th>
           <th>Brand</th>
           <th>Made IN</th>
           <th>Manufacturing date</th>
           <th>ExpiryDate</th>
           <th>Image</th>
           <th>ACTIONS</th>
       </tr>
</thead>
<tbody >
       <c:forEach var="product" items="<%=new ProjectDao().findAll()%>">
            <tr>
                <td>${product.proId}</td>
                <td>${product.proName}</td>
                <td>${product.proPrice}</td>
                <td>${product.proBrand}</td>
                <td>${product.proMadeIn}</td>
                <td>${product.proMfgDate}</td>
                <td>${product.proExpDate}</td>
                <td><img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product.proImage)}" alt="ProductImage" style="max-width:100px; max-height:100px;">
                </td>
                <td>
                <a class="btn btn-primary"
                href="./DeleteProductServlet?proId=${product.proId}">Delete</a>
                </td>
                <td>
                <a class="btn btn-primary"
                href="./EditProductServlet?proId=${product.proId}">Edit</a>
                </td>
                
                
                
            </tr>
            
		</c:forEach>
</tbody>
</table>
</body>
</html>