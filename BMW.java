package com.code;

public class BMW extends Car{
 private int airBags;

 public void color()
 {
	 System.out.println("white");
 }
 public void speed()
 {
	 System.out.println("speed of BMW is 280 kmph");
 }
public BMW(int modelno, String color, int airBags) {
	super(modelno, color);
	System.out.println("IN PARAMETERIZED CONSTR. OF BMW");
	this.airBags = airBags;
}

@Override
public String toString() {
	return super.toString()+"BMW [airBags=" + airBags + "]";
}
 
 
}
