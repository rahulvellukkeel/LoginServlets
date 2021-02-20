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
		String passcheck = "rahul";
		String id = req.getParameter("id");
		String pass = req.getParameter("password");
		String nextservlet = "fail";

		PrintWriter out = res.getWriter(); 
		out.println(id + " " +pass);
		
		
		if (id.equals(idcheck)) {
			if (pass.equals(passcheck)) 
			{

				nextservlet = "success";
				//out.println("True");
				
			}

		}

		res.sendRedirect(nextservlet);

		/*
		 * PrintWriter out = res.getWriter(); out.println(id);
		 */
	}

}
