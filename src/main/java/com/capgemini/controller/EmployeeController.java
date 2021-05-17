package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Employee;
import com.capgemini.services.EmployeeSeviceImpl;

@RestController
@RequestMapping("/api/employeee")
public class EmployeeController {
	
	@Autowired
	private EmployeeSeviceImpl employeeserviceImpl;
	
	@PostMapping("/")
	public boolean createEmployee(@RequestBody Employee employee) {
		employeeserviceImpl.createEmployee(employee);
		return true;
	}
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable int id) {
		Employee employee = employeeserviceImpl.findById(id);
		return employee;
	}
	
	

}
