package com.singletonclass;

public class SingletonImplementation {
	//step 1
	
	static SingletonImplementation instance=null;
	
	public String s;
	
	private SingletonImplementation()
	{
		s="I am from a constructor";
		System.out.println(s);
	}
	
	
	public static SingletonImplementation getInstance() {
		
		if(instance==null)instance=new SingletonImplementation();
		
		
		return instance;
		
	}
	
	
	
	

}
