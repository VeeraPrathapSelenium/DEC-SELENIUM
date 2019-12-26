package com.staticvsinstance;

public class StaticVsInstance {

	public static void main(String[] args) {
		//create an object
StaticVsInstance 	obj=new StaticVsInstance();	
obj.sub();
		
	}
	
	
	public static void add()
	{
		System.out.println("i am a add method");
	}
	
	public void sub()
	{
		add();
		System.out.println("i am a sub method");
	}
	
	public void mul()
	{
		System.out.println("i am a mul method");
	}

}
