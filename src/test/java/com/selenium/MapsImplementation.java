package com.selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapsImplementation {

	public static void main(String[] args) {
		
	List<Empdetails> empdeatils=new ArrayList<>();
	Map<Integer,List<Empdetails> > emp_details=new HashMap<>();
	
	for(int i=1;i<=5;i++)
	{
		empdeatils.add(new Empdetails("User"+i, "Company"+i, 5000*i));
		emp_details.put(i, empdeatils);
	}
	
	for(int i=1;i<=emp_details.size();i++)
	{
		System.out.println(emp_details.get(i).get(i-1).getName());
		
		System.out.println(emp_details.get(i).get(i-1).getCompany());
		System.out.println(emp_details.get(i).get(i-1).getSalaray());
	}
	
	
	
	
	
	
	
	
	
//	System.out.println(emp_details);
//	
//	System.out.println(emp_details.size());
//	
//	// using for-each loop for iteration over Map.entrySet() 
//    for (Map.Entry<Integer,List<Empdetails>> entry : emp_details.entrySet())  
//        System.out.println("Key = " + entry.getKey() + 
//                         ", Value = " + entry.getValue());   
//    
//    
//} 
	
	

	}	
	
		
		
		
		
		
		
		
		
		
		
		

	}


