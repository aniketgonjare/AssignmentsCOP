package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String name, String color, double weight) {
		super(name, color, weight);
		
	}
	
	public String taste()
	{
		return "sweet n sour";
	}
	
	public void jam()
	{
		System.out.println("name: "+getName()+" color: "+getColor()+" \n making jam!!");
	}
	

}
