package com.cg.packagetwo;

import com.cg.packageone.TestOne;

public class TestThree extends TestOne {

	public static void main(String[] args) {
		TestOne t3=new TestOne();
		System.out.println(t3.id);
		t3.display();
	}

}
