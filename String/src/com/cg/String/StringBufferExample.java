package com.cg.String;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuilder s=new StringBuilder();
		System.out.println(s.capacity()); //Default capacity
		
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(sb.capacity());
		sb.append("How are you?");
		System.out.println(sb.capacity());
		sb.append("I am fine");//21*2+2
		
		
		
	}

}
