/*August 1, 2022*/

package com.daily.Controller;


import java.io.IOException;
//import java.io.PrintWriter;

import com.daily.Model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Controller-> Navigates between your model and view

@SuppressWarnings("serial")
@WebServlet("/login")

public class LoginController extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException
	{
		res.setContentType("text/html");
//		PrintWriter pw = res.getWriter();
		String uname = req.getParameter("un");
		String pwd = req.getParameter("pwd");
		
		User u1 = new User();
		u1.setUsername(uname);
		u1.setPassword(pwd);
		req.setAttribute("abc", u1);

		boolean status = u1.validateUserNamePwd();// model

		if (status)
		{
			RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("failure.jsp");
			rd.forward(req, res);
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		doPost(req, res);
	}
}