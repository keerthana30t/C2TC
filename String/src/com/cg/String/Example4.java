package com.cg.String;

public class Example4 {

	public static void main(String[] args) {
		String s="Great",t="s";
		String u=s.concat(t);
		if(u==s) {
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		String e=s+t;
		if(e==s) {
			System.out.println("same");
		}
		else
		{
			System.out.println("Not same");
		}
	}

}
