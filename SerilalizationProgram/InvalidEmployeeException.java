package com.exception;

@SuppressWarnings("serial")
public class InvalidEmployeeException extends Exception {
	public InvalidEmployeeException(String mesg) {
		super(mesg);
	}

}
