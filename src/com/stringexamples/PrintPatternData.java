package com.stringexamples;

public class PrintPatternData {

	public static void main(String[] args) {
		String str = "3a4b5D7";

		String temp = "";

		for (int i = 0; i <= str.length() - 1; i++) {

			if ((i != str.length() - 1) && (i + 1 < str.length()) && (i + 2 < str.length()))

			{

				char c1 = str.charAt(i);
				char c2 = str.charAt(i + 1);
				char c3 = str.charAt(i + 2);

				if (Character.isDigit(c1)) {
					if (Character.isLetter(c2) && Character.isDigit(c3)) {
						temp = temp + c1 + c2 + "@";
					}

				}
			}

		}
		
		
		System.out.println(temp);
		
		
		String[] arr=temp.split("@");
		
		for (String word : arr) {
			
		
			
			int i=Integer.valueOf(word.substring(0,1));
			String chrcc=word.substring(1,2);
			
			printPattern(i,chrcc);
			
		}
		
		

	}
	
	
	
	
	
	public static void printPattern(int i, String c)
	
	{
		String temp="";
		for(int j=1;j<=i;j++)
		{
			temp=temp+c;
		}
		
		System.out.println(temp);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
