package com.cg.interfaceclass;

interface Dad{
	void snooring();
}
interface Mom{
	void snooring();
}

class You implements Dad,Mom{
	
	public void snooring() {
		System.out.println("My parent have the habit of snooring");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		You y=new You();
		y.snooring();
		
	}

}
