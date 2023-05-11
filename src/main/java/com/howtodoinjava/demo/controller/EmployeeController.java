package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.howtodoinjava.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/getemployee")
    public List<Employee> getEmployees() 
    {

		return employeeService.getEmployees();
    }

}
