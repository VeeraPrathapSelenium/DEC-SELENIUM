package com.interfaces;

public interface Interface1 {
	
	int a=10;
	
	public void add();
	
	public int add(int a,int b);
	
	static void testSomeThing() {
		System.out.println("Hello i am java 8 feature");
	}
	
	default void testNewMethod()
	{
		System.out.println("Hello i am java 8 feature");
	}

	
	
	

}
