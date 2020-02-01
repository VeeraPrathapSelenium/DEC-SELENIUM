package com.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {


		List <String> mylist=new ArrayList<String>();
		
		mylist.add("Hello");
		mylist.add("Learning");
		mylist.add("Selenium");
		
		//print
		
		System.out.println(mylist.get(0));
		
		//size --length
		System.out.println(mylist.size());
		
		//update
		mylist.set(2, "Java");
		System.out.println(mylist.get(2));
		
		//for
		
		for(int i=0;i<=mylist.size()-1;i++)
		{
			System.out.println(mylist.get(i));
		}
//******************************************
		
		//for each
		
		for (String string : mylist) {
			System.out.println(string);
		}
		
		//iterator
		Iterator itr=mylist.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
