package com.cg.abstractclass;

public class AbstractDemo {

	public static void main(String[] args) {
		Square s=new Square();
		s.side=5;
		s.calcArea();
		s.show();
		
		Rectangle r=new Rectangle();
		r.breadth=10;
		r.length=10;
		r.calcArea();
		r.show();

	}

}
