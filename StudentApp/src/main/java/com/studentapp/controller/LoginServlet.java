package com.studentapp.controller;

import java.io.IOException;
import java.util.List;

import com.studentapp.model.RegisterAdmin;
import com.studentapp.service.AdminService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
//	 private static final String ADMIN_USER = "admin";
//	 private static final String ADMIN_PASS = "admin123";

    /**
     * Default constructor. 
     */
	 
	 private AdminService service;
    public LoginServlet() {
    	
    	this.service = new AdminService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String usernameLocal = request.getParameter("username");
//		String passwordLocal = request.getParameter("password");
//		
//		
//		if(ADMIN_USER.equals(usernameLocal) && ADMIN_PASS.equals(passwordLocal)) {
//			HttpSession session = request.getSession();
//			session.setAttribute("username", usernameLocal);
//			session.setMaxInactiveInterval(30*60);
//			
//			response.sendRedirect(request.getContextPath() + "/listStudent");
//		}else {
//			request.setAttribute("error", "Invalid username or password.");
//			request.getRequestDispatcher("/login.jsp").forward(request, response);
//		}
		List<RegisterAdmin> admins = service.getRegisterAdmins();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isUserInDb = false;
		for(RegisterAdmin admin: admins) {
//			System.out.println(admin.getUsername() + "Username admin");
//			System.out.println(admin.getPassword() +"Password admin");
			if(admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
				isUserInDb = true;
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				session.setMaxInactiveInterval(30*60);
				response.sendRedirect(request.getContextPath() + "/listStudent");
				return;
			}
		}
		if(!isUserInDb) {
			request.setAttribute("error", "Invalid username or password.");
		    request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

}
