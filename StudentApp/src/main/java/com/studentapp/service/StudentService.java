package com.studentapp.service;


import java.sql.SQLException;
import java.util.List;

import com.studentapp.dao.StudentDao;
import com.studentapp.model.Student;

public class StudentService {
	
	private StudentDao studentDAO;
	
	public StudentService() {
		this.studentDAO = new StudentDao();
	}
	
	public int addStudent(Student student) throws SQLException {
		String error = null;
//		try {
//			int affectedRows = studentDAO.addStudent(student);
//			if (affectedRows == 0) {
//				error = "Error in inserting student object ";
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//			error = "Email is null";
//		}
		int affectedRows = studentDAO.addStudent(student);
		if (affectedRows == 0) {
			error = "Error in inserting student object ";
		
	}
		return affectedRows;
	}
	public List<Student> getStudents() {
		
		return studentDAO.getStudentsDAO();
	}

	public void deleteStudent(int id) {
		studentDAO.deleteStudentWithId(id);
		
	}

}
