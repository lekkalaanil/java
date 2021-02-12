package com.example.demo.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintDefinitionException;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> violationException(MethodArgumentNotValidException exception,HttpServletRequest request)
	{
		
		

		List<String> errors = new ArrayList<>();
		
	    exception.getBindingResult().getAllErrors().forEach((error) -> {

	        String errorMessage = error.getDefaultMessage();
	        errors.add(errorMessage);
	    });
		
		ErrorDetails errorDetails=new ErrorDetails();
		errorDetails.setMessege(errors.toString());
		errorDetails.setUrl(request.getRequestURI());
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_REQUEST);
	}
}
