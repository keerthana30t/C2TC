package com.cg.statickeyword;

public class Student {
	
	private int id;
	private String name;
	private String college="AVK";
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	void modify() {
		college="Arakalagudu varadaraju Kantamma College";
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", getClass()=" + getClass() + "]";
	}
	
	
	
	

}
