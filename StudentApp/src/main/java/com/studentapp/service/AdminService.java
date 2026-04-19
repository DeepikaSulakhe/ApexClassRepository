package com.studentapp.service;

import java.util.List;

import com.studentapp.dao.AdminDao;
import com.studentapp.model.RegisterAdmin;

public class AdminService {
	
	private AdminDao adminDao;
	
	public AdminService() {
		this.adminDao = new AdminDao();
	}

	public int addAdmin(RegisterAdmin admin) {
		String error = null;
		int affectedRows = 0;
		affectedRows = adminDao.registerAdmin(admin);
		if (affectedRows == 0) {
			error = "Error in inserting admin object ";
		}
		return affectedRows;
	}

	public List<RegisterAdmin> getRegisterAdmins() {
		
		return adminDao.getRegisterAdminDao();
	}

}
