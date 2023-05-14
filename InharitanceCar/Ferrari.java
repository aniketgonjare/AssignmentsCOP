package com.code;

public class Ferrari extends Car{
 private int NOS;
 
 public void color()
 {
	 System.out.println("Black");
 }
 public void speed()
 {
	 System.out.println("speed of ferrari is 350 kmph");
 }

public Ferrari(int modelno, String color, int nOS) {
	super(modelno, color);
	System.out.println("in parameterizd constr. of ferrari");
	NOS = nOS;
}
 
 public String toString()
 {
	 return super.toString()+" nos : "+NOS;
 }
 
}
