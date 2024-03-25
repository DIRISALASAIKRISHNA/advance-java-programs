package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//step1:- Read the data
		int ProID= Integer.parseInt(request.getParameter("ProId"));
		String ProName = request.getParameter("ProName");
		double ProPrice = Double.parseDouble(request.getParameter("ProPrice"));
		int proQuantity = Integer.parseInt(request.getParameter("proQuantity"));
		double TotalPrice=0.0;
		double NetPriceToPay=0.0;
		double discount =0.0;
		
		//step2:- process the data
		
		if (TotalPrice<1000 )
		{
			NetPriceToPay=TotalPrice;
		}
		else if(TotalPrice>1000&& TotalPrice<5000)
		{
			discount= TotalPrice*0.05;
			NetPriceToPay=TotalPrice-discount;
		}
		else if(TotalPrice>5000&& TotalPrice<10000)
		{
			discount= TotalPrice*0.10;
			NetPriceToPay=TotalPrice-discount;
		}
		else
		{
			discount= TotalPrice*0.15;
			NetPriceToPay=TotalPrice-discount;
			
		}
		
		//Render the responce
		
		response.setContentType("text/html");
		PrintWriter writer= response.getWriter();
		writer.println("<html>");
		writer.println("product id="+ ProID );
		writer.println("<br><br>");
		writer.println("product name="+ProName);
		writer.println("<br><br>");
		writer.println("product price="+ProPrice);
		writer.println("<br><br>");
		writer.println("product quantity="+proQuantity);
		writer.println("<br><br>");
		writer.println("product total price="+TotalPrice);
		writer.println("<br><br>");
		writer.println("product discount="+discount);
		writer.println("<br><br>");
		writer.println("product net price to pay="+NetPriceToPay);
		writer.println("<br><br>");
		writer.println("</html>");
		
	}


}
