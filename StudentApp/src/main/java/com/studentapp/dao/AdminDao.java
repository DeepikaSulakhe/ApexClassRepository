package com.studentapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.studentapp.model.RegisterAdmin;

public class AdminDao {
	static final String URL = "jdbc:mysql://localhost:3306/studentdb";
	static final String USER = "root";
	static final String PASS = "password18";

	public int registerAdmin(RegisterAdmin admin) {
	
		int exectedRows = 0;
		String sql = "insert into admin (username,password) values (?, ?)";
		try(Connection connection = DriverManager.getConnection(URL,USER,PASS);
				PreparedStatement preparedStatement = connection.prepareStatement(sql)
			){
			preparedStatement.setString(1,admin.getUsername());
			preparedStatement.setString(2, admin.getPassword());
			exectedRows = preparedStatement.executeUpdate();
			System.out.println("rows affected in admin: " + exectedRows);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return exectedRows;
	}

	public List<RegisterAdmin> getRegisterAdminDao() {
		List<RegisterAdmin> adminList = new ArrayList();
		String sql = "SELECT * FROM admin";
		
		try(Connection connection = DriverManager.getConnection(URL,USER,PASS);
				Statement statement = connection.createStatement();
				
				ResultSet resultSet = statement.executeQuery(sql)){
					
					while(resultSet.next()) {
						RegisterAdmin admin = new RegisterAdmin();
						admin.setId(resultSet.getInt("id"));
						admin.setUsername(resultSet.getString("username"));
						admin.setPassword(resultSet.getString("password"));
					 adminList.add(admin);
					}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return adminList;
	}

}
