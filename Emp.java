package com.app.org;

public class Emp {
	
	private int id;
	private String firstName;
	private String lastname;
	private int deptId;
	protected double basic;
	private static int idcounter;
	
	static
	{
		idcounter=100;
		
	}
	public Emp(String firstName, String lastname, int deptId, double basic) {
		
		this.id=idcounter++;
		this.firstName = firstName;
		this.lastname = lastname;
		this.deptId = deptId;
		this.basic = basic;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public String toSTring()
	{
		return "ID: "+id+"Name: "+firstName+" "+lastname+"DeptId: "+deptId+"Salary: "+basic;
	}
	
	public void computeNetSalary()
	{
		System.out.println("Employee Salary: "+this.basic);
	}
	
	
	

}
