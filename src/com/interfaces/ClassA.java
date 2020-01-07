package com.interfaces;

public class ClassA extends ClassB1 implements Interface1 {

	public static void main(String[] args) {
		
		Interface1 i=new ClassA();
		i.add();
		i.testNewMethod();
		Interface1.testSomeThing();
		System.out.println(Interface1.a);
		

	}

	@Override
	public void add() {
		System.out.println("Zero arg method");
		
	}

	@Override
	public int add(int a, int b) {
		System.out.println("Two arg method");
		return 0;
	}
	
	
	public static void myOwnMethod()
	{
		System.out.println("My Own Method");
	}


	
}
