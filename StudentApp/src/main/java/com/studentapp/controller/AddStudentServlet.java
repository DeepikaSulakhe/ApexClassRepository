package com.studentapp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.sql.SQLException;

import com.studentapp.model.Student;
import com.studentapp.service.StudentService;


/**
 * Servlet implementation class addStudentServlet
 */
@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentService service;

    /**
     * Default constructor. 
     */
    public AddStudentServlet() {
    	this.service = new StudentService();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String course = request.getParameter("course");
		double marks = Double.parseDouble(request.getParameter("marks"));
		
		Student student = new Student(1,name,email,course,marks);
		
		
		    int success = 0;
			try {
				success = service.addStudent(student);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			if (success > 0) {
			    response.sendRedirect(request.getContextPath() + "/listStudent");
				//response.sendRedirect("listStudent");
			} else {
			    request.setAttribute("error", "insert_failed");
			    request.getRequestDispatcher("/addStudent.jsp").forward(request, response);
			}
        
	}

}
