package com.genericmethods;

public class GenericMethods {
	
	/**
	 * @Name :launchBrowser
	 * @param browserName
	 * 
	 * @purpose:This method is used to launch any of the browsers like  IE,CHROME<FF
	 * 
	 * @author :tm
	 */
	
	public void launchBrowser(String browserName)
	{
		
		System.out.println("Launch the browser : "+browserName);
		
	}
	
	
	public void closeBrowser()
	{
		
		System.out.println("Closing the browser");
		
	}
	
	
	public void waitTill_Element_Displayed()
	{
		System.out.println("Wait for element");
	}
	
	public void enterData(String data)
	{
		System.out.println("Enter data :"+data);
	}
	
	
	
	
	

}
