package com.cg.array;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		int intArr[]= {10,20,15,29,30};
		System.out.println(intArr[2]);
		System.out.println(Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		int key=20;
		System.out.println(Arrays.binarySearch(intArr, key));
		
		int intArr1[]= {10,15,20,29,30};
		System.out.println(Arrays.equals(intArr, intArr1));
		
		int intArr2[]=Arrays.copyOf(intArr1, 9);
		System.out.println(Arrays.toString(intArr2));
		
		Arrays.fill(intArr2,20);
		System.out.println(Arrays.toString(intArr2));
		
		
	}

}
