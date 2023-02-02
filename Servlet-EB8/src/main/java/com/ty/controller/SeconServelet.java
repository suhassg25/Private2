package com.ty.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SeconServelet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name= (String) req.getParameter("myname");
		String num= (String) req.getParameter("number");
		System.out.println("Name is "+name+"  number is "+num); // print in console
		
		PrintWriter pw= res.getWriter();
		pw.println("<html> <body> <h3> Your Name and number "+name+"  "+num +"</h3> </body></html>"); //print in client side
	
		
		
	}

}
