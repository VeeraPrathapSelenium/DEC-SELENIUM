package com.encapsulation;

public class Employee_Data {
	
	private int id;
	
	private String name;
	
	private String company;
	
	private Long salary;
	
	
	
	

	public Employee_Data(int id, String name, String company, Long salary) {
	
		this.id = id;
		this.name = name;
		this.company = company;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
	
	
	

}
