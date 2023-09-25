package com.cg.hierarchialinheritance;

public class Student extends person {
	
	private int rollno;
	private String StudentName;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", StudentName=" + StudentName + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + "]";
	}
	
	
	
	
	

}
