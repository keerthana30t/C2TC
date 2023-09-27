package com.cg.statickeyword;

class Outer{
	static int data=10;
	
	static class Inner{
		void msg() {
			System.out.println(data);
		}
	}
}

public class StaticClass {

	public static void main(String[] args) {
		Outer.Inner i=new Outer.Inner();
		i.msg();

	}

}
