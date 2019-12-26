package com.thiskeyword;

public class RoleOfThisKeyword {

	static int a = 20;
	static int b = 30;

	public static void main(String[] args) {
		
		RoleOfThisKeyword ref=new RoleOfThisKeyword();
		
		ref.add(10,30);

	}

	public  void add(int a, int b) {

		System.out.println(a+b);
		
		System.out.println(this.a+this.b);
		
	}

}
