package com.controller;

public class HallIdExceptionController extends RuntimeException{
private int id;
public HallIdExceptionController(int id) {
	super();
	this.id=id;
	
}
@Override
public String toString() {
	return "id " + id + " not found";
}

}
