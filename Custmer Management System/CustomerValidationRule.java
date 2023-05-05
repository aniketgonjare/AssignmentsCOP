package com.app.customer;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.List;

public class CustomerValidationRule {

	public static Customer ValidateAll(String firstname, String lastname, String email, String passwd, double regAmt,
			String dob, String plan, String subscriptionDate, List<Customer> cust) throws InvalidCustomerException {
		validateEmail(email, passwd, cust);

		LocalDate d = LocalDate.parse(dob);
		LocalDate SubscriptionDate = LocalDate.parse(subscriptionDate);
		validateAge(dob);

		ServicePlan sp = validatePlan(plan);
		CheakPlanAndRegamount(plan, regAmt);
		
		

		return new Customer(firstname, lastname, email, passwd, regAmt, d, sp, SubscriptionDate);
	}

	public static LocalDate updateSubscriptionAmount(Customer validCustomer) {
		System.out.println("pay amount to update Subscription");
		return LocalDate.now();

	} 

	private static ServicePlan validatePlan(String plan) throws InvalidCustomerException {

		return ServicePlan.valueOf(plan.toUpperCase());

	}

	private static ServicePlan CheakPlanAndRegamount(String plan, double regAmt) throws InvalidCustomerException {

		ServicePlan sp = ServicePlan.valueOf(plan.toUpperCase());

		if (regAmt == sp.getPlanCost()) {

			return sp;
		} else
			throw new InvalidCustomerException("Invalid registration amount for plan!!!");

	}

	private static void validateAge(String dob) throws InvalidCustomerException {
		LocalDate l1 = LocalDate.parse(dob);

		int age = Period.between(l1, LocalDate.now()).getYears();
		if (age < 21)
			throw new InvalidCustomerException("ERROR404 : age of customer is less than 21");

	}

	private static void validateEmail(String email, String passwd, List<Customer> cust)
			throws InvalidCustomerException {

		Customer cd = new Customer(email);
		for (Customer c : cust) {
			if (c != null) {
				if (c.equals(cd)) {
					throw new InvalidCustomerException("email is already used");
				}
			}

		}

	}
	
	public static void removeCustomers(List<Customer> cust)
	{
		LocalDate c2=LocalDate.now();
		
			//LocalDate c1=c.getLastSubscriptionDate();
			//int p=Period.between(c1, c2).getMonths();
			
			Iterator<Customer> it=cust.iterator();
			while(it.hasNext()) {
				Customer c1=it.next();
				LocalDate c3=c1.getlastSubscriptionDate();
				
				//LocalDate c1=((Customer) it).getLastSubscriptionDate();
				long p=Period.between(c3, c2).getMonths();
				
		
			if(p>3)
			{
				System.out.println("removed "+c1.getFirstname()+" "+c1.getLastname());
				 it.remove();
				
				
			}
			}
			
		}
	

	public static Customer cheakLoginDetails(String email, String pass, List<Customer> cust)
			throws InvalidCustomerException {
		Customer cv = new Customer(email);
		int index = cust.indexOf(cv);
		Customer cd = cust.get(index);
		if (index == -1) {
			throw new InvalidCustomerException("Invalid email");
		} else {
			if (cd.getPasswd().equals(pass)) {
				return cd;
			} else
				throw new InvalidCustomerException("Invalid passwd");
		}

	}

}
