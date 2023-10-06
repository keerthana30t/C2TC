package com.cg.String;

public class contains {

	public static void main(String[] args) {
		
		//Example1
		String name="How are you?";
		System.out.println(name.contains("How are"));
		System.out.println(name.contains("you"));
		System.out.println(name.contains("Keerthana"));
		
		//Example2
		String str="Hai K#E#E#R#T#H#A#N#A";
		boolean isContains=str.contains("K#E#E#R#T#H#A#N#A");
		System.out.println(isContains);
		System.out.println(str.contains("KEERTHANA"));
		
		//Example3
		String s="Keerthana is very polite";
		if(s.contains("polite"))
		{
			System.out.println("This string contains polite");
		}
		else
		{
			System.out.println("Result Not Found");
		}
	}

}
