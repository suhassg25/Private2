package com.ty.studentservlet.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.ty.studentservlet.dao.Studentdao;
import com.ty.studentservlet.dto.Studentdto;

public class LoginController extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		String email=arg0.getParameter("email");
		String password=arg0.getParameter("password");
		
		Studentdao studentdao=new Studentdao();
		Studentdto student=studentdao.getSTudent(email);
		
		if(student.getPassword().equals(password))
		{
			RequestDispatcher dispatcher=arg0.getRequestDispatcher("index.html");
			dispatcher.forward(arg0, arg1);
		}
		else
		{
			arg1.getWriter().print("<html> <body> Invalid password </body></html>");
			RequestDispatcher dispatcher=arg0.getRequestDispatcher("login.html");
			dispatcher.include(arg0, arg1);
		}
		
	}

	
}
