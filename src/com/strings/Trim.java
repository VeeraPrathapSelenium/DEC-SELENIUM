package com.strings;

public class Trim {

	public static void main(String[] args) {
		String str="        india             ";
		
		
		System.out.println("Before Trim :"+str.length());
		
		
		str=str.trim();
		
		System.out.println("After Trim :"+str.length());
		
		

	}

}
