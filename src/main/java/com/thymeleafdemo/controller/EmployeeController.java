package com.thymeleafdemo.controller;

import com.thymeleafdemo.entity.Employee;
import com.thymeleafdemo.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	private EmployeeService employeeService;
	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;

	}

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		// get employee from db
		List<Employee> theEmployees = employeeService.findAll();

		// add to the spring model
		theModel.addAttribute("employees", theEmployees);

		return "list-employees";
	}
}









