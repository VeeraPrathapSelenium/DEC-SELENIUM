package com.constructorinheritance;

public class Child extends Parent{

	Child(){
		super(10);
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
		Child obj=new Child();
	}

}
