package org.zeesense.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zeesense.springmvc.dao.LoginDAO;
import org.zeesense.springmvc.dto.EmployeeDTO;
import org.zeesense.springmvc.dto.LoginDTO;

@Service
public class LoginService {

	@Autowired
	private LoginDAO dao;

	public EmployeeDTO fetchEmployeeDetails(String email, String userName) {

		EmployeeDTO employeeDTO = dao.fetchLoginDetails(email, userName);
		return employeeDTO;
	}
}
