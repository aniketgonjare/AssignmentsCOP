package com.code;

public abstract class Car {
 private int modelno;
 private String color;
 
 public abstract void color();
 public abstract void speed();
 
public Car(int modelno, String color) {
	System.out.println("in parameterized constr of car");
	this.modelno = modelno;
	this.color = color;
}
public Car() {
	System.out.println("in parameterless constr of car");
	this.modelno=101;
	this.color="white";
}

@Override
public String toString() {
	return "Car [modelno=" + modelno + ", color=" + color + "]";
}
public int getModelno() {
	return modelno;
}
public void setModelno(int modelno) {
	this.modelno = modelno;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
 
 
}
