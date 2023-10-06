package com.cg.String;

public class StringBuffer {

	public static void main(String[] args) {
		
		//immutable
		String s1 = new String("Study");
		String s2=s1.concat("Night");
		System.out.println(s1);
		System.out.println(s2);
		
		//mutable
		StringBuilder sb = new StringBuilder("Study");
		sb.append("Night");
		System.out.println();
		
	}

}
