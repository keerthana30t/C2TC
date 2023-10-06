package com.cg.String;

public class Stringreplace {

	public static void main(String[] args) {
		String s1="keerthana";
		String replaceString=s1.replace('a','v');
		System.out.println(replaceString);
		
		
		StringBuilder sb=new StringBuilder("Hello");
		sb.replace(1, 3, "java");
		System.out.println(sb);
	}

}
