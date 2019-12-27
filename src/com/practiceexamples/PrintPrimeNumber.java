package com.practiceexamples;

public class PrintPrimeNumber {

	public static void main(String[] args) {

		int uservalue=27;
		
		int flag=0;
		for(int i=1;i<=uservalue;i++)
		{
			
			if(uservalue % i==0)
			{
				flag++;
			}
			
			
			
		}
		
		
		if(flag==2) {
			System.out.println("Number is Prime");
		}else
		{
			System.out.println("Number is not a Prime");
		}
		
		
		

	}

}
