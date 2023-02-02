package com.ty.studentservlet.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.ty.studentservlet.dao.Studentdao;
import com.ty.studentservlet.dto.Studentdto;

public class Controls extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		int age=Integer.parseInt(req.getParameter("age"));
		long phone=Long.parseLong(req.getParameter("number"));
		String schoolname=req.getParameter("schoolname");
		String email=req.getParameter("email");
		String pwd=req.getParameter("password");
		
		Studentdto s=new Studentdto();
		s.setName(name);
		s.setAddress(address);
		s.setAge(age);
		s.setPhone(phone);
		s.setScahool_name(schoolname);
		s.setEmail(email);
		s.setPassword(pwd);
		
		Studentdao studentdao =new Studentdao();
		studentdao.save(s);
		
		RequestDispatcher rs=req.getRequestDispatcher("Dummy.html");
		rs.forward(req, res);
		
	}
	
	

}
