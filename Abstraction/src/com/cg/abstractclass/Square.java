package com.cg.abstractclass;

//concrete class
public class Square extends Shape {
	
	float side;

	
	@Override
	void calcArea() {
		super.area=side*side;
		
	}

}
