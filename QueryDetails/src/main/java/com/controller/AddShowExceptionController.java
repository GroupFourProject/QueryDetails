package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AddShowExceptionController {
@ExceptionHandler()
public ResponseEntity<?> handleAddShowException(AddShowException a,WebRequest req){
	return new ResponseEntity<>(a.toString(),HttpStatus.NOT_FOUND);
}
}

