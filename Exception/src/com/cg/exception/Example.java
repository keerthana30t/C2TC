package com.cg.exception;

public class Example {

	public static void main(String[] args) 
	{
		Example ob=new Example();
		try {
			ob.meth1();
		}
		catch(ArithmeticException e)
		{
		System.out.println("ArithmeticException hrown by meth1()method is caught in main()method");	}

		}
	
	
public void meth1()
{
	try {
		System.out.println(100/0);
	}
	catch(Exception nullExp)
	{
		System.out.println("We have an exception -" +nullExp);
	}
	System.out.println("outside try catch block");
}
}