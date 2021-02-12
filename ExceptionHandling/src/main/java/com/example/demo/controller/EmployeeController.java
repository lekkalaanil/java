package com.example.demo.controller;

import javax.validation.ConstraintDefinitionException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotfoundException;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	
	@GetMapping("get/{eid}")
	public ResponseEntity<?> getEmpById(@PathVariable Long eid) throws EmployeeNotfoundException
	{
		return service.getEmployee(eid);
	}
	
	@PostMapping("save")
	public ResponseEntity<?> saveEmp(@RequestBody @Valid Employee emp) {
//		if(emp.getEmail()==null)
//		{
//			throw new ConstraintDefinitionException("email is mandatory");
//		}else if(emp.getPassword()==null)
//		{
//			throw new ConstraintDefinitionException("password is mandatory");
//		}
		
		return service.saveEmp(emp);
		
	}
}
