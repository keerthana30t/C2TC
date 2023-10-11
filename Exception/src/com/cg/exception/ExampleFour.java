package com.cg.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleFour {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("c:/myfile.txt");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		int k;
		try {
			while((k=fis.read())!=-1)
			{
				System.out.println((char)k);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
