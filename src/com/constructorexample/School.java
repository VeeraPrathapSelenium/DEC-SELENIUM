package com.constructorexample;

public class School {
	String name;
	
	int age;
	
	String std;
	
	int rollnumber;
	
	School(String name,int age,String std){
		this.name=name;
		this.age=age;
		this.std=std;
		this.rollnumber=this.rollnumber+1;	
		
	}
	
	public void getStudentDetails()
	{
		
		System.out.println("Student Name :"+name);
		System.out.println("Student Age :"+age);
		System.out.println("Student Standard :"+std);
		System.out.println("Student Roll :"+rollnumber);
	}
	
	
	

}
