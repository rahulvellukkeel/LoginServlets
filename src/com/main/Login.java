package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idcheck = "rahul";
		String passcheck = "1234";
		String id = req.getParameter("id");
		String pass = req.getParameter("password");

		PrintWriter out = res.getWriter(); 
		out.println(id + " " +pass);
		
		
		if (id.equals(idcheck)) {
			if (pass.equals(passcheck)) 
			{

				res.sendRedirect("success.html");
				//out.println("True");
				
			}

		}

		else
		{
			res.sendRedirect("failed.html");
		}
		

		/*
		 * PrintWriter out = res.getWriter(); out.println(id);
		 */
	}

}
