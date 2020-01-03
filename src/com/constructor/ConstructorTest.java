package com.constructor;

public class ConstructorTest {
	
	int a;
	
	int b;
	
	ConstructorTest(){
		this(10);
		System.out.println("Zero argument based constructor");
		
	}
	
	ConstructorTest(int a){
		this(a,20);
		this.a=a;
		
		System.out.println("one argument based constructor");
	}
	
	ConstructorTest(int a,int b){
		this.a=a;
		this.b=b;
		
		System.out.println("Two argument based constructor");
	}
	
	

}
