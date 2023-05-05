package com.app.customer; 

import java.util.ArrayList;
import java.util.List;

public class CustomerUtils {
	
	
	
	public static List<Customer> PopulateCustomers() {
	try
	{
		List<Customer> customer=new ArrayList<>(); 
		customer.add(CustomerValidationRule.ValidateAll("sham", "girhe", "sham@gml", "shM@123" ,10000.0, "2001-09-09",  "platinum","2023-04-01",customer));
		customer.add(CustomerValidationRule.ValidateAll("utki", "rane", "utk@gml", "utk@123" ,1000.0, "2001-02-02", "silver","2023-05-01",customer));
		customer.add(CustomerValidationRule.ValidateAll("aniket ","gonjare"," anik@gml"," anik@123 ",2000.0 ,"2000-09-09", "gold","2023-03-06",customer));
		customer.add(CustomerValidationRule.ValidateAll("darshan", "patil", "darsh@gml", "darsh@123" ,1000.0, "2002-02-02", "silver","2023-01-12",customer));
		customer.add(CustomerValidationRule.ValidateAll("shubham", "badgujar", "shubh@gml", "shubh@123" ,1000.0, "1999-12-02", "silver","2022-01-01",customer));
		customer.add(CustomerValidationRule.ValidateAll("niks", "bhosle", "nikh@gml", "nikh@123" ,10000.0, "1855-12-02", "platinum","2023-01-01",customer));
		  return customer;

	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return null;
	}
	}


