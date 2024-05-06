package com.said.jpa.Exception;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<List<Error>> validationError(ConstraintViolationException ex) {
		
		List<Error> errors = new ArrayList<Error>();
		for (ConstraintViolation violation : ex.getConstraintViolations()) {
			
			UUID errorId = UUID.randomUUID(); 
			Error error = new Error(errorId, violation.getMessage(), HttpStatus.BAD_REQUEST.toString());
			errors.add(error);
			}
		
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
	
}
