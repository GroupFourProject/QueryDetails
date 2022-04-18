package com.controller;

public class MovieNameException extends RuntimeException{
	private String s;
	public MovieNameException(String s) {
		super("MovieName is not found");
		this.s=s;
	}
	
	@Override
	public String toString() {
		return "MovieName " + s + " does not exists";
	}
	

}
