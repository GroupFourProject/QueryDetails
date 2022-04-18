package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ShowIdRestExceptionController {
@ExceptionHandler(ShowIdException.class)
public ResponseEntity<?> handleShowIdException(ShowIdException s,WebRequest req){
	return new ResponseEntity<>(s.toString(),HttpStatus.NOT_FOUND);
}
}
