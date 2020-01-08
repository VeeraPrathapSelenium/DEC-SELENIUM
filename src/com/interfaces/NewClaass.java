package com.interfaces;

public class NewClaass {

	public static void main(String[] args) {
		
		MyInterface obj=new MyInterface() {

			@Override
			public void add() {
				System.out.println("Do addition");
				
			}

			@Override
			public void sub() {
				System.out.println("Do Subtraction");
				
			}
			
			
			
			
			
		};
		
		obj.add();
		obj.sub();
		
			
		
	}

}
