package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public LoginServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username=request.getParameter("Username");
	String password=request.getParameter("password");
	
	String status;
	if(username.equals("Sathya")&& password.equals("Sathya@123"))
	{
		status= "Login Successfull...";
		
	}
	 else
	 {
		status="Login Fail...";	
	 }
	PrintWriter writer = response.getWriter();
	response.setContentType("text/html");
	writer.println("<html>");
	writer.println("<h1>Login status...</h1>"+status);
	writer.println("</html>");
		
	}

	
}
