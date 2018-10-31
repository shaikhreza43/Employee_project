package org.zeesense.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.zeesense.springmvc.dto.EmployeeDTO;
import org.zeesense.springmvc.dto.LoginDTO;
import org.zeesense.springmvc.service.LoginService;

@Controller
@RequestMapping("*")
public class LoginController {

	@Autowired
	private LoginService loginService;

	// private LoginDTO loginDTO;

	@PostMapping("/login.do")
	public ModelAndView fetchEmployeeDetails(@ModelAttribute LoginDTO loginDto) {
		System.out.println(loginDto);
		EmployeeDTO employeeDTO = null;

		employeeDTO = loginService.fetchEmployeeDetails(loginDto.getEmail(), loginDto.getUserName());
		System.out.println(employeeDTO);
		if (employeeDTO == null) {
			return new ModelAndView("error.jsp");
		}
		if (employeeDTO.getPassword().equals(loginDto.getPassword()))
			return new ModelAndView("workspace.jsp");
		else
			return new ModelAndView("error.jsp");

	}
	
}
