package com.cg.abstractclass;

//Abstract class
public abstract class Shape {
	
	float area;
	
	abstract void calcArea();
	
	void show() {
		System.out.println("Area of shape:"+area);
	}

}
