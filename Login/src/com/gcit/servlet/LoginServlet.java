package com.gcit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("****************************************");
		System.out.println("****************************************");
		System.out.println("****************************************");
		System.out.println("****The Servlet is being initialized****");
		System.out.println("****************************************");
		System.out.println("****************************************");
		System.out.println("****************************************");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + " " + password);
		if (username == null || password == null) {
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE);
		}
		else if (username.equals("burkemasles") && password.equals("smoothstack")) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html><body>Username and Password Correct!!!</body></html>");
		}
		else
			response.sendError(HttpServletResponse.SC_FORBIDDEN);
			
	}

}
