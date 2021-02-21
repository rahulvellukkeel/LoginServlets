package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idcheck = "rahul";
		String passcheck = "1234";
		String id = req.getParameter("id");
		String pass = req.getParameter("password");

		PrintWriter out = res.getWriter(); 
		//out.println(id + " " +pass);
		
		
		RequestDispatcher rd = null;
		
		if (id.equalsIgnoreCase(idcheck) && pass.equals(passcheck)) {
				
				//using dispcatcher
				rd=req.getRequestDispatcher("success");
				rd.forward(req, res);
			
				//using redirect
				//res.sendRedirect("success.html");
			
			
			}

		else
		{
			/*
			 * rd=req.getRequestDispatcher("Index.html"); out.
			 * println("<h2><span style= 'color:red'> Error!!! invalid credentials </span></h2>"
			 * ); rd.include(req, res);
			 */
			
			//res.sendRedirect("fail");
			
			rd=req.getRequestDispatcher("fail");
			rd.forward(req, res);
			
			
		//	res.sendRedirect("failed.html");
		}
		

		/*
		 * PrintWriter out = res.getWriter(); out.println(id);
		 */
	}

}
