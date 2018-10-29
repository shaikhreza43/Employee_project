package org.zeesense.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import org.zeesense.springmvc.dao.EmployeeDAO;
import org.zeesense.springmvc.dto.EmployeeDTO;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public Integer saveEmployee(EmployeeDTO employeeDTO)
	{
		Integer identifier=employeeDAO.saveEmployeeDetails(employeeDTO);
		return identifier;
	}

}
