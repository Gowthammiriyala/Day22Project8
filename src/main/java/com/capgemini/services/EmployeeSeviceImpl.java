package com.capgemini.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entities.Employee;
import com.capgemini.repository.EmployeeRepository;

@Service
public class EmployeeSeviceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public boolean createEmployee(Employee employee) {
		employeeRepository.save(employee);
		return false;
	}

	@Override
	public boolean updateEmploye(Employee employee) {
		
		return false;
	}

	
	@Override
	public Employee findById(int id) {
		Employee e =  employeeRepository.findById(id).get();
		return e;
		
	}
	
	

}
