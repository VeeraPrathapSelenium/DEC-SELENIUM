package com.interfaces;

public interface FuncInterface {
	
	void abstract_Test_Method(int x);// abstract method
	
	//non abstract method
	default void test() {
		System.out.println("Non abstract method");
	}

}
