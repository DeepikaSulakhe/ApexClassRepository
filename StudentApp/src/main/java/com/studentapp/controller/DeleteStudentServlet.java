package com.studentapp.controller;

import java.io.IOException;

import com.studentapp.service.StudentService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteStudentServlet
 */
@WebServlet("/deleteStudent")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	private StudentService service;
    public DeleteStudentServlet() {
    	this.service = new StudentService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studentId = 0;
		try {
		    studentId = Integer.parseInt(request.getParameter("id"));
		    // proceed with deletion
		} catch (NumberFormatException e) {
		    // Log the error and show a user-friendly message
		    response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid Student ID format.");
		}
		service.deleteStudent(studentId);
		response.sendRedirect("listStudent");
	}

}
