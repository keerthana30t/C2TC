package com.cg.String;

public class EqualignoreCase {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="HELLO";
		String s3="Hello";
		String s4="Hello Everyone";
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s1));
	}

}
