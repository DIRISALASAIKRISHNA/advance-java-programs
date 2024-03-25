package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EditProductServlet")
public class EditProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public EditProductServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String proId=request.getParameter("proId");
		
		ProjectDao projectDao=new ProjectDao();
		product existingproduct = projectDao.findById(proId);
		request.setAttribute("existingproduct", existingproduct);
		
			RequestDispatcher dispatcher=request.getRequestDispatcher("edit-form.jsp");
			dispatcher.forward(request, response);
		
		
	}

}