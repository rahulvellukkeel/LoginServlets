package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FailureServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out = res.getWriter();
		RequestDispatcher rd =req.getRequestDispatcher("Index.html");
		
		rd.include(req, res);
		out.println("<h2><span style= 'color:red'> Error!!! Invalid credentials </span></h2>");
	}
	
	
}
