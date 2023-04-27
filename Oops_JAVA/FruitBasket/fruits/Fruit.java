package com.app.fruits;

public abstract class Fruit {
	private String name;
	private String color;
	private double weight;
	private Boolean fresh=true;
	
	public Fruit(String name, String color, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh=true;
	}
	
	public String getColor() {
		return color;
	}

	public String toString()
	{
		return "Name: "+this.name+"color: "+this.color+"weight: "+weight;
	}
	
	public abstract String taste();

	public Boolean getFresh() {
		return fresh;
	}

	public void setFresh(Boolean fresh) {
		this.fresh = fresh;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}


}
