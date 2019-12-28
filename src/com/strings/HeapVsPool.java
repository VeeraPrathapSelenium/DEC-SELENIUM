package com.strings;

public class HeapVsPool {

	public static void main(String[] args) {


		String s1="india";
		
		String s2="india";
		
		
		System.out.println(s1==s2);
		
		
		
		String s3=new String("india");
		
		String s4=new String("india");
		
		System.out.println(s3==s4);
		
		
		s1="america";
		
		System.out.println(s1);
		

	}

}
