package com.cg.statickeyword;

public class StaticMethod {

	public static void main(String[] args) {
		Student s1=new Student(1,"Keeru");
		System.out.println(s1);
		System.out.println("-----After Modification-----");
		//3 ways
		//1.Directly with the name of the method
		//2.Invoking with the class name
		//3.You can also call with object reference
		//Student.modify();
		s1.modify();
		System.out.println(s1);
	}

}
