package com.arrays;

public class StringArrays {

	public static void main(String[] args) {
		
		String[] userNames=new String[5];
		userNames[0]="Prathap";
		userNames[1]="Raj";
		userNames[2]="Krish";
		userNames[3]=null;
		userNames[4]="Ram";
		
		
		
		
		for(int i=0;i<=userNames.length-1;i++)
		{
			
			System.out.println(userNames[i]);
			
		}
		
		//********************************************
		
		for (String username : userNames) {
			System.out.println(username);
		}


	}

}
