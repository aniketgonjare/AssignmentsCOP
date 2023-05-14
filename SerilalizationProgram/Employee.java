package com.code;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {

	private String empid;
	private String firstName;
	private String lastName;
	private Department dept;
	private double salary;
	private LocalDate joiningDate;

	public Employee(String empid, String firstName, String lastName, Department dept, double salary,
			LocalDate joiningDate) {
		super();
		this.empid = empid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept
				+ ", salary=" + salary + "Joining Date: " + joiningDate + "]";
	}

}
