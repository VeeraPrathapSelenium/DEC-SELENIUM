package com.practiceexamples;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		
		int userInput=scanner.nextInt();
		
		for (int i=1;i<=20;i++)
		{
			
			
			System.out.println(userInput + " * "+i+" = "+ (i*userInput));
			
			
		}
		
		
		

	}

}
