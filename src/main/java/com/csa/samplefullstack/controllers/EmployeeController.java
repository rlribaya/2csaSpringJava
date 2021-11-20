package com.csa.samplefullstack.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import com.csa.samplefullstack.repository.EmployeeRepository;
import com.csa.samplefullstack.entity.Employee;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired // spring dependency injection
	private EmployeeRepository employeeRepository;

	@RequestMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
}