package com.stringexamples;

public class CheckPalindrome {

	public static void main(String[] args) {


		StringBuffer bfr=new StringBuffer("madam");
		
		String data=bfr.reverse().toString();
		
		System.out.println(bfr);
		System.out.println(data.equals("madam"));
		

	}

}
