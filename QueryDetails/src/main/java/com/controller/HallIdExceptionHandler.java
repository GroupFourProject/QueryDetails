package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class HallIdExceptionHandler {
@ExceptionHandler(HallIdExceptionController.class)
public ResponseEntity<?> handleHallIdException(HallIdExceptionController h,WebRequest req){
	return new ResponseEntity<>(h.toString(),HttpStatus.NOT_FOUND);
}
}
