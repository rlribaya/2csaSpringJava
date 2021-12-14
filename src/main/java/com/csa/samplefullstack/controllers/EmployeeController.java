package com.csa.samplefullstack.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

	@PostMapping("/employees")
	public Employee postEmployee(@RequestBody Employee employee){
		return employeeRepository.save(employee);
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable Long id){
		return employeeRepository.findById(id).get();
	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<HttpStatus> DeleteEmployeeById(@PathVariable Long id){
		employeeRepository.deleteById(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}
}