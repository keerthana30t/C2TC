package com.cg.exceptionhandling;

public class Throw {
	
	public static void validate(int age)
	{
		if(age<21 || age>27)
		{
			throw new ArithmeticException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible is attend Military selection");
		}
	}
	public static void main(String[] args) {
		try {
			validate(23);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
