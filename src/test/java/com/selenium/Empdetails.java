package com.selenium;

public class Empdetails {
	
	private String name;
	
	private String company;
	
	private int salaray;
	
	
	public Empdetails(String name, String company, int salaray) {
		this.name = name;
		this.company = company;
		this.salaray = salaray;
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

	public int getSalaray() {
		return salaray;
	}

	public void setSalaray(int salaray) {
		this.salaray = salaray;
	}


	
	

}
