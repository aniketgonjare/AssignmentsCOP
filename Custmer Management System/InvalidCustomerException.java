package com.app.customer;

@SuppressWarnings("serial")
public class InvalidCustomerException extends Exception{
	
	public InvalidCustomerException(String mesg)
	{
		super(mesg);
	}

}
