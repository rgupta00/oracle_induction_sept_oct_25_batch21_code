package com.app1;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		System.out.println("it is a ctr");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init is called");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("inside doGet method");
		PrintWriter out = response.getWriter();
		out.print("hello current date and time is :" + LocalDateTime.now());
	}

	@Override
	public void destroy() {
		System.out.println("destory");
	}

}
