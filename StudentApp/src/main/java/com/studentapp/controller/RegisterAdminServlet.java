package com.studentapp.controller;

import java.io.IOException;
import java.util.List;

import com.studentapp.model.RegisterAdmin;
import com.studentapp.model.Student;
import com.studentapp.service.AdminService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterAdminServlet
 */
@WebServlet("/registerAdmin")
public class RegisterAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	private AdminService service;
	
    public RegisterAdminServlet() {
    	this.service = new AdminService();
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RegisterAdmin admin = new RegisterAdmin(1,username,password);
		int success = 0;
		
		success = service.addAdmin(admin);
		
		boolean isUsernameValid = username.matches("^[A-Za-z]+$");
		boolean isPasswordValid = password.matches("^[A-Za-z0-9]+$");
		
		if(success > 0) {
			response.sendRedirect(request.getContextPath() + "/login");
		}else if(!isUsernameValid || !isPasswordValid) {
			request.setAttribute("error", "invalid");
			request.setAttribute("error", "insert_failed");
		    request.getRequestDispatcher("/registerAdmin.jsp").forward(request, response);
			
		}
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<RegisterAdmin> admins = service.getRegisterAdmins();
		request.setAttribute("admins", admins);
//		RequestDispatcher rd = request.getRequestDispatcher("/LoginServlet");
//		rd.forward(request, response);
	}

}
