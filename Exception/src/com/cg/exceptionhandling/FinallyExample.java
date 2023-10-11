package com.cg.exceptionhandling;

public class FinallyExample {

	public static void main(String[] args) {
		try {
			int data=30/0;
			System.out.println(data);
			}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("In finally Block");
		}

	}

}