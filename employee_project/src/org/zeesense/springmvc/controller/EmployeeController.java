package org.zeesense.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zeesense.springmvc.dto.EmployeeDTO;
import org.zeesense.springmvc.service.EmployeeService;

@Controller
@RequestMapping("*")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/saveemp.do")
	public ModelAndView saveEmployee(@ModelAttribute EmployeeDTO employeeDTO)
	{
		Integer identifier=employeeService.saveEmployee(employeeDTO);
		
		if(identifier!=null)
		return new ModelAndView("success.jsp");
		else
			return new ModelAndView("error.jsp");
		
		
	}

}