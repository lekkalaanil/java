package com.example.demo.service;

import javax.validation.ConstraintDefinitionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotfoundException;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	
	public ResponseEntity<?> getEmployee(Long eid) throws EmployeeNotfoundException
	{
		if(!repo.existsById(eid))
		{
			throw new EmployeeNotfoundException("emp not found with id: "+eid);
		}else {
		return new ResponseEntity<>(repo.findById(eid),HttpStatus.OK);
		}
	}
	
	public ResponseEntity<?> saveEmp(Employee emp) {
		
		return new ResponseEntity<>(repo.save(emp),HttpStatus.OK);

	}

}
