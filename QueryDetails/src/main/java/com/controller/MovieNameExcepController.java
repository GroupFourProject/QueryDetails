package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class MovieNameExcepController {
@ExceptionHandler(MovieNameException.class)
public ResponseEntity<?> handleMovieNameException(MovieNameException m,WebRequest req){
	return new ResponseEntity<>(m.toString(),HttpStatus.NOT_FOUND);
}
}
