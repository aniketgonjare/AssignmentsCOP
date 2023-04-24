package com.app.org;

public class Worker extends Emp {
	private int hoursWorked;
	private int hourlyRate;
	private double total;
	/*
	 * -id,name,basic,deptId,hoursWorked,hourlyRate
	 */
	public Worker(String firstName, String lastname, int deptId, double basic,int hoursWorked,int hourlyRate)
	{
		super( firstName, lastname, deptId, basic);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	
	@Override
	public void computeNetSalary()
	{
		//System.out.println("Manager Salary: "+(this.hourlyRate*this.hoursWorked)+super.getBasic());
		total=(this.hourlyRate*this.hoursWorked)+super.getBasic();
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" "+this.total;
	}

}
