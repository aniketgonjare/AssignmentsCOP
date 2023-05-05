package com.app.customer;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
	public double getRegAmt() {
		return regAmt;
	}

	public LocalDate getDob() {
		return dob;
	}

	private int custId;
	private String firstname;
	private String lastname;
	private String email;
	private String passwd;
	private double regAmt;
	private LocalDate dob;
	private static int counter;
	private ServicePlan plan;
	private LocalDate lastSubscriptionDate;

	static {
		counter = 100;
	}

	public Customer(String firstname, String lastname, String email, String passwd, Double regAmt, LocalDate dob,
			ServicePlan plan, LocalDate lastSubscriptionDate) {
		super();
		this.custId = counter++;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.passwd = passwd;
		this.regAmt = regAmt;
		this.dob = dob;
		this.plan = plan;
		this.lastSubscriptionDate = lastSubscriptionDate;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", regAmt=" + regAmt + ", dob=" + dob + ", lastsubscriptionDate " + lastSubscriptionDate + "]";
	}

	public LocalDate getLastSubscriptionDate() {
		return lastSubscriptionDate;
	}

	public void setLastSubscriptionDate(LocalDate lastSubscriptionDate) {
		this.lastSubscriptionDate = lastSubscriptionDate;
	}

	public LocalDate getlastSubscriptionDate() {
		return lastSubscriptionDate;
	}

	@Override
	public boolean equals(Object o) {

		if (o instanceof Customer)
			return this.email.equals(((Customer) o).email);
		return false;

	}

	@Override
	public int compareTo(Customer anotherCustomer) {
		return this.email.compareTo(anotherCustomer.email);
	}

}
