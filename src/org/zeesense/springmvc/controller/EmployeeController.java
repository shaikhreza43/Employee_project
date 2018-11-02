package org.zeesense.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.zeesense.springmvc.dto.EmployeeDTO;
import org.zeesense.springmvc.service.EmployeeService;

@Controller
@RequestMapping("*")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/saveemp.do")
	public ModelAndView saveEmployee(EmployeeDTO employeeDTO) {
		Integer identifier = employeeService.saveEmployee(employeeDTO);
		System.out.println(employeeDTO);
		if (identifier != null)
			return new ModelAndView("success.jsp");
		else
			return new ModelAndView("saveemployee.jsp");

	}

	@PostMapping("/update.do")
	public ModelAndView updateEmployeeDetails(EmployeeDTO employeeDTO) {
		System.out.println(employeeDTO);
		boolean status = employeeService.updateEmployeeDetails(employeeDTO);
		if (status)
			return new ModelAndView("success.jsp");
		else
			return new ModelAndView("update.jsp");

	}

	@GetMapping("/delete.do")
	public ModelAndView deleteEmployeeDetails(HttpServletRequest request) {
		Integer result = null;
		Integer id =  (Integer) request.getServletContext().getAttribute("id");
		if (id > 0 ) {
			result = employeeService.deleteEmployeeDetails(id);
		}
		if (result > 0)
			return new ModelAndView("delete-success.jsp");
		else
			return new ModelAndView("delete.jsp");
	}

}
