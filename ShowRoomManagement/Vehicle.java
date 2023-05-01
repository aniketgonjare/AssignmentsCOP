package com.code;

public class Vehicle {
	private String chasisNo;
	private String name;
	private VehicleColor color;
	private double basePrice;
	private String manufacturingDate;
	private  boolean isAvailable;
	
	
	public Vehicle(String chasisNo)
	{
	  this.chasisNo=chasisNo;
	}
	
	public Vehicle(String chasisNo, String name, VehicleColor color, double basePrice, String manufacturingDate) {
		super();
		this.chasisNo = chasisNo;
		this.name = name;
		this.color = color;
		this.basePrice = basePrice;
		this.manufacturingDate = manufacturingDate;
		this.isAvailable=true;
	}
	
	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", name=" + name + ", color=" + color + ", basePrice=" + basePrice
				+ ", manufacturingDate=" + manufacturingDate + "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle)o).chasisNo); 
		return false;
	}
	
	
	
	

}
