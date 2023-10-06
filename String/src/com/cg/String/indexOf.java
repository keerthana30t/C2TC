package com.cg.String;

public class indexOf {

	public static void main(String[] args) {
		String s1="Hello Everyone";
		int index4=s1.indexOf('e');
		System.out.println(index4);
		int index3=s1.indexOf("Everyone");
		System.out.println(index3);
		int index2=s1.indexOf("Hello");
		System.out.println(index2);
		int index1=s1.indexOf("Everyone",2);
		System.out.println(index1);
		
		

	}

}
