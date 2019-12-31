package com.stringexamples;

public class SumUp {

	public static void main(String[] args) {
		String str="AB65DEF74HJ123HNB741";
		
		str=str.replaceAll("[^0-9]", "@");
		
		System.out.println(str);
		
		int temp=0;
		
		String[] arr=str.split("@");
		
		for (String string : arr) {
			
			//System.out.println(string);
			if(! string.isEmpty() ) {
				
				temp=temp+Integer.valueOf(string)	;
			}
			
		}
		
		System.out.println(temp);

	}

}
