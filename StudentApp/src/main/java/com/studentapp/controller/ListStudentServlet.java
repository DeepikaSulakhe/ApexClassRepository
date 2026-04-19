package com.studentapp.controller;

import java.io.IOException;
import java.util.List;

import com.studentapp.model.Student;
import com.studentapp.service.StudentService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listStudentServlet
 */
@WebServlet("/listStudent")
public class ListStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	private StudentService service;
	
    public ListStudentServlet() {
    	this.service = new StudentService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Student> students = service.getStudents();
		request.setAttribute("students", students);
		request.getRequestDispatcher("/listStudent.jsp").forward(request, response);
	}
}
