package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DelectProductServlet")
public class DelectProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DelectProductServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String proId=request.getParameter("proId");
		
		ProjectDao projectDao=new ProjectDao();
		int dcount= projectDao.deleteById(proId);
		
		if(dcount==1)
		{
			request.setAttribute("deleteResult",dcount);
			RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
			dispatcher.forward(request, response);
		}
		
		else
		{
			response.setContentType("text/html");
			PrintWriter Writer =response.getWriter();
			Writer.println("<html>");
			Writer.println("data insertion fail check once"+dcount);
			RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
			dispatcher.forward(request, response);
			Writer.println("</html>");
	}

		}

	
}
