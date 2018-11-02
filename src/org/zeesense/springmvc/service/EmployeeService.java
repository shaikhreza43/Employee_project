package org.zeesense.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zeesense.springmvc.dao.EmployeeDAO;
import org.zeesense.springmvc.dto.EmployeeDTO;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	public Integer saveEmployee(EmployeeDTO dto) {
		Integer identifier = employeeDAO.saveEmployeeDetails(dto);
		return identifier;

	}

	public boolean updateEmployeeDetails(EmployeeDTO employeeDTO) {
		return employeeDAO.updateEmployeeDetails(employeeDTO);
	}

	public Integer deleteEmployeeDetails(Integer id) {

		return employeeDAO.deleteEmployeeDetails(id);
	}

}
