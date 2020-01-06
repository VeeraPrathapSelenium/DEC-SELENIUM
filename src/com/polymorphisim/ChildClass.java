package com.polymorphisim;

public class ChildClass extends Parent_Over {

	public static void main(String[] args) {
		
		
		ChildClass c=new ChildClass();
		c.add(10, 20);

	}
	
	public Integer add(int a,int b)
	{
		System.out.println("Sum :+(a+b)");
		return 10;
	}
	

}
