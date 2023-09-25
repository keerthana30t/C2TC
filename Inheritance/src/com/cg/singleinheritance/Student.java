package com.cg.singleinheritance;

public class Student extends Citizen{
	
	private int rollno;
	private String collegeName;
	
	
	public Student() {
		super();
	}
	public Student(int rollno, String collegeName) {
		super();
		this.rollno = rollno;
		this.collegeName = collegeName;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAadharno()=" + getAadharno() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno()
				+ "]";
	}
	
	

	

}
