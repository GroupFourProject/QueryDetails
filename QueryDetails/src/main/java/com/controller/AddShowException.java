package com.controller;

public class AddShowException extends RuntimeException{
	public AddShowException() {
		super("Show cannot be added");
	}
	public String toString() {
		return "shows cannot be added kindly remove one show";
	}
}
