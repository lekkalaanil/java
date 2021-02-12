package com.example.demo.exception;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintDefinitionException;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(EmployeeNotfoundException.class)
	public ResponseEntity<?> exception(EmployeeNotfoundException exception,HttpServletRequest request)
	{
		ErrorDetails errorDetails=new ErrorDetails();
		errorDetails.setMessege("employee not found");
		errorDetails.setUrl(request.getRequestURI());
		return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ConstraintDefinitionException.class)
	public ResponseEntity<?> violationException(ConstraintDefinitionException exception,HttpServletRequest request)
	{
		ErrorDetails errorDetails=new ErrorDetails();
		errorDetails.setMessege(exception.getLocalizedMessage());
		errorDetails.setUrl(request.getRequestURI());
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_REQUEST);
	}
}
