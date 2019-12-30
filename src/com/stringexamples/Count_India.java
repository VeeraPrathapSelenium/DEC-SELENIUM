package com.stringexamples;

public class Count_India {

	public static void main(String[] args) {
		String str="inDIA is great country INDia is having good iNDIA is vast country";
		int count=0;
		
		//str=str.toLowerCase();
		
		System.out.println(str);
		
		String[] arr=str.split(" ");
		
		for (String string : arr) {
			
			if(string.equalsIgnoreCase("india")) count++;
			
			
		}
		
		
		System.out.println(count);
		
		
		

	}

}
