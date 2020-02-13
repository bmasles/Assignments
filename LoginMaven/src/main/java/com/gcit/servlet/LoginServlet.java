package com.gcit.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gcit.dto.User;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

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
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BufferedReader reader = request.getReader();
		Gson gson = new Gson();
		User usr = null;
		try {
			usr = gson.fromJson(reader, User.class);
		} catch (JsonSyntaxException e) {
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE);
			return;
		}
		if (usr == null || usr.getUsername() == null || usr.getPassword() == null) {
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE);
		}
		else if (usr.getUsername().equals("burkemasles") && usr.getPassword().equals("smoothstack")) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html><body>Username and Password Correct!!!</body></html>");
		}
		else
			response.sendError(HttpServletResponse.SC_FORBIDDEN);
			
	}

}
