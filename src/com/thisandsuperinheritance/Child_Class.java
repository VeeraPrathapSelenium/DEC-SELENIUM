package com.thisandsuperinheritance;

public class Child_Class extends Parent_Class {
	


	public static int a=50;
	
	public static String name="Testing Masters";
	
	

	public static void main(String[] args) {
		Child_Class c=new Child_Class();
		
		c.do_Test();

	}
	
	public void do_Test()
	{	System.out.println(this.name);
		System.out.println(this.a);
		
		System.out.println(super.name);
		System.out.println(super.a);
	}
	
	

}
