package com.cg.exceptionhandling;

import java.io.IOException;

public class ThrowsException {
	
	public static void validate(int age)throws IOException{
		if(age<21 || age>27) {
			throw new IOException("Not Eligible");
		}
		else {
			System.out.println("Eligible to attend Military Selection");
		}
	}

	public static void main(String[] args) {
		try {
			validate(30);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
