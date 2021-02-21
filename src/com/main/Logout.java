package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout extends HttpServlet 
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//res.sendRedirect("Index.html");
		PrintWriter out = res.getWriter();
		RequestDispatcher rd =req.getRequestDispatcher("Index.html");
		
		rd.include(req, res);
		
		
		out.println("<h2><span style= 'color:blue'>Successfully logged out </span></h2>");
		
	}
	
}
