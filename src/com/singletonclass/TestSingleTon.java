package com.singletonclass;

public class TestSingleTon {

	public static void main(String[] args) {
		
		
		SingletonImplementation impl=SingletonImplementation.getInstance();
		
		SingletonImplementation impl2=SingletonImplementation.getInstance();
		
		SingletonImplementation impl3=SingletonImplementation.getInstance();
	}

}
