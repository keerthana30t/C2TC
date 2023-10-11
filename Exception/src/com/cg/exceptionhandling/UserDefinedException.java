package com.cg.exceptionhandling;

import java.util.Scanner;

class InvalidBloodDonateException extends Exception{
	public InvalidBloodDonateException(String s) {
		super(s);
	}
}

public class UserDefinedException {
	
	public static void validate(int age,int weight) throws InvalidBloodDonateException {
		if(age<18 || weight<55) {
			throw new InvalidBloodDonateException("Not eligible to donate Blood");
		}
		else {
			System.out.println("you are eligible to donate Blood");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
			
			System.out.println("Enter your age");
			int age=sc.nextInt();
			
			System.out.println("Enter your weight");
			int weight=sc.nextInt();
			try {
				validate(age,weight);

			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}


