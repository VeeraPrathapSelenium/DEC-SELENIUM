package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class EncapTest {

	public static void main(String[] args) {

		List<Employee_Data> lst=new ArrayList();
		
		
		lst.add(	new Employee_Data(101, "Raj", "CTS", (long) 10000));
		
		lst.add(new Employee_Data(108, "Rahul", "TCS", (long) 80000));
		
		lst.add(new Employee_Data(851, "Rakesh", "Capgemini", (long) 90000));
		
		

		for (Employee_Data employee_Data : lst) {
			System.out.println(employee_Data.getName());
			System.out.println(employee_Data.getId());
			System.out.println(employee_Data.getSalary());
			System.out.println(employee_Data.getCompany());
		}
		
		
	}

}
