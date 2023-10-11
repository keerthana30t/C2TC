package com.cg.exception;

public class Main {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		System.out.println("Exception Example");
		try {
			int z=x/y;
			System.out.println(z);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
