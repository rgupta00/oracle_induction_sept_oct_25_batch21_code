package com.app1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app1.model.Calculator;


public class CalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer x=Integer.parseInt(request.getParameter("x"));
		Integer y=Integer.parseInt(request.getParameter("y"));
		
		Integer result=Calculator.add(x, y);
		
		request.setAttribute("result", result);
		RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	
		
	}

}
