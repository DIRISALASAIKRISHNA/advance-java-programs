package com.sathya2.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 @WebServlet("/sai")
public class HelloWorldApp2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public HelloWorldApp2Servlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>this is my first html program inadv java<h1>");
		writer.println("<h2>project name is Helloworldapp2</h2>");
		writer.println("<h3>finally i got it and ratan sir is woowwww....</h3>");
		writer.println("</html>");


}
}
