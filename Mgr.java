package com.app.org;

public class Mgr extends Emp {
	
	private double perfBonus;
	
	
	public double getPerfBonus() 
	{
		return perfBonus;
	}

	public Mgr(String firstName, String lastname, int deptId, double basic,double perfBonus)
			{
				super(firstName, lastname, deptId, basic);
				this.perfBonus=perfBonus;
			}
	
	@Override
	public void computeNetSalary()
	{
		System.out.println("Manager Salary: "+(this.perfBonus+super.getBasic()));
	}
	@Override
	public String toString()
	{
		return super.toSTring()+" "+perfBonus;
	}

}
