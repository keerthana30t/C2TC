package com.cg.statickeyword;

public class StaticBlock {
	
	private int id;
	private String name;
	private String college="AVK";
	
	static {
		System.out.println("I am a Static Block");
	}
	
	public StaticBlock(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "StaticBlock [id=" + id + ", name=" + name + ", college=" + college + ", getClass()=" + getClass() + "]";
	}


	public static void main(String[] args) {
		System.out.println("I am a Main Block");
	}

}
