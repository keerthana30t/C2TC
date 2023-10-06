package com.cg.String;

public class StringOperation {

	public static void main(String[] args) {
		String s1=new String(" Indian ");
		System.out.println(s1);
		
		String s2=s1.toUpperCase();
		System.out.println(s2);
		
		System.out.println(s1.length());
		
		System.out.println(s1.substring(2));
		
		System.out.println(s1.substring(2,4));
		
		System.out.println(s1.trim());
		
		System.out.println(s1.strip());
		
		System.out.println(s1.isEmpty());
		
		char c[]= {'I','n','d','i','a','n'};
		String s=new String(c);
		System.out.println(s);
		
		
		
		
		
		
	}

}
