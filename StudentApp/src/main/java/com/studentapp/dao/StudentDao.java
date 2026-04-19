package com.studentapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.studentapp.model.Student;

public class StudentDao {
	
	static final String URL = "jdbc:mysql://localhost:3306/studentdb";
	static final String USER = "root";
	static final String PWD = "password18";

	public int addStudent(Student student) throws SQLException {

		int executeUpdate = 0;

			try (Connection connection = DriverManager.getConnection(URL,USER,PWD);
					PreparedStatement preparedStatement = connection
							.prepareStatement("insert into students (name, email,course,marks) values (?, ?, ?, ?)")) {
				preparedStatement.setString(1, student.getName());
				preparedStatement.setString(2, student.getEmail());
				preparedStatement.setString(3, student.getCourse());
				preparedStatement.setDouble(4, student.getMarks());
				executeUpdate = preparedStatement.executeUpdate();
				System.out.println("rows affected : " + executeUpdate);
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
		return executeUpdate;
	}

	public List<Student> getStudentsDAO() {
		List<Student> students = new ArrayList();
		String sql = "SELECT * FROM students";
		
		try(Connection connection = DriverManager.getConnection(URL,USER,PWD);
				Statement statement = connection.createStatement();
				
				ResultSet resultSet = statement.executeQuery(sql)){
					
					while(resultSet.next()) {
						Student student = new Student();
						student.setId(resultSet.getInt("id"));
						student.setName(resultSet.getString("name"));
						student.setEmail(resultSet.getString("email"));
						student.setCourse(resultSet.getString("course"));
						student.setMarks(resultSet.getDouble("marks"));
					 students.add(student);
					}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return students;
	}

	public void deleteStudentWithId(int id) {
		String sql = "DELETE FROM students WHERE id = ?";
		try(Connection connection = DriverManager.getConnection(URL,USER,PWD);
				PreparedStatement preparedStatement = connection.prepareStatement(sql)){
			
			preparedStatement.setInt(1, id);
			int rows = preparedStatement.executeUpdate();
			System.out.println(rows + "row(s) deleted");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
