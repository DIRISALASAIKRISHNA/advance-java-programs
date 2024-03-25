package com.saikrishna.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SaiKrishnaservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaiKrishnaservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();

		writer.println("third program");
		writer.println("try to run the code");
		writer.println("code is running");
	}

	

}
