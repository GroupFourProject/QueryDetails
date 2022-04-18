package com.controller;

public class ShowIdException extends RuntimeException {
private int id;
public ShowIdException(int id) {
	super("id "+id+" not found");
	this.id=id;
}
@Override
public String toString() {
	return "id " + id + " not available";
}
	
}
