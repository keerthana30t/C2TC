package com.cg.exception;

public class ExampleThree {

	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			arr[7]=100/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch(Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Rest of the code");
	}

}
