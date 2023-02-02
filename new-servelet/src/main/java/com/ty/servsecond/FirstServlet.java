package com.ty.servsecond;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
//		String name=(String) req.getParameter("myname");
//		Integer age=Integer.parseInt(req.getParameter("age"));
//		Long num=Long.parseLong(req.getParameter("number"));
//		String pwd=(String) req.getParameter("pwd");
//		String email=(String) req.getParameter("email");
//		
//		PrintWriter pw=res.getWriter();
//		pw.println("<html> <body> <h3> Your name : "+name +" age "+ age +" number "+num+" email address " +email+" Pasword " +pwd+"</h3> </body> </html>");
		
		String name=(String) req.getParameter("myname");
		Long num=Long.parseLong(req.getParameter("number"));
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
		dispatcher.forward(req, res);
		
//		dispatcher=req.getRequestDispatcher("saveStudent.html");
//		dispatcher.include(req, res);
	}
	
	

}
