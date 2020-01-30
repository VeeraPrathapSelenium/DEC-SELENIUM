package com.commonutils;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.excelplugin.ExcelParser;
import com.readproperties.ReadProperties;

public class CommonUtils extends ExcelParser {
	
	
	
	public WebDriver driver;
	public ReadProperties properties;
	public Properties property;
	
	/**
	 * method name:launchBrowser
	 * Description: This method is used to launch teh browser specified by the user
	 * input parameter: String browsertype, String url
	 * output parameter:boolean status
	 */
	
	
	public boolean launchBrowser()
	{
		boolean status=true;
		
		String browserType="";
		String url="";
		
		
		try {
			
			if(properties==null) {
				properties =new ReadProperties();
				property=properties.getConfigFile();
			}
			
			//get environment
			String environment=property.getProperty("ENVIRONMENT");
			
			switch(environment.toLowerCase()) {
			
			case "qa":
				url=property.getProperty("QA_URL");
				break;
			case "uat":
				url=property.getProperty("UAT_URL");
				break;
			case "int":
				url=property.getProperty("INT_URL");
				break;
				
			}			
			//create a switch case which can take any browserTyep
			browserType=property.getProperty("BROWSER");
			System.out.println("Launching the browser :"+browserType );
			
			switch(browserType.toLowerCase()) {
			
			
			case "chrome":
				//set teh chrome driver path
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				driver=new ChromeDriver();
				break;
			case "ff":
				//set the ff driver path
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				driver=new FirefoxDriver();
				break;	
				
			
			
			}
		// regardless of browser type, user must pass an url and maximize it accordingly	
			
			driver.get(url);
			driver.manage().window().maximize();	
			System.out.println("Browser :"+browserType +" is launched sucessfully");
			
		}catch(Exception e)
		{
			status=false;
			System.out.println("Error occure while launching the browser :"+browserType );
			System.out.println(e.getMessage());
		}
		
		return status;
		
		
	}
	
	/**
	 * method name:closeBrowser
	 * Description: This method is used to close browser
	 * input parameter: NA
	 * output parameter:boolean status
	 */
	
	public boolean closeBrowser() {
		System.out.println("Tryingto close the browser..!!");
		boolean status=true;
		try {
			driver.close();
			System.out.println("Browser closed  sucessfully");
		}catch(Exception e)
		{
			status=false;
			System.out.println("Unable to close the Browser");
		}		
		
		return status;
		
	}
	
	
	/**
	 * method name:quitDriverSession
	 * Description: This method is used to close browser
	 * input parameter: NA
	 * output parameter:boolean status
	 */
	
	public boolean quitDriverSession() {
		System.out.println("Trying to quit driver object..!!!");
		boolean status=true;
		try {
			driver.quit();
			System.out.println("Driver object killed successfully");
		}catch(Exception e)
		{
			status=false;
			System.out.println("Unable to kill driver object");
		}		
		
		return status;
		
	}
	
	
	/**
	 * method name:clickAndSendData
	 * Description: This method is used to click,clear and send the data
	 * input parameter: String elementName,String pageName,WebElement element,String data
	 * output parameter:boolean status
	 */
	
	public boolean clickAndSendData(String elementName,String pageName,WebElement element,String data) {
		System.out.println("Trying to send the data to the element "+elementName+" on the page "+pageName);
		boolean status=true;
		try {
			element.click();
			element.clear();
			element.sendKeys(data);
			System.out.println("Data is sent successfully for the element "+elementName+" on the page "+pageName);
			
		}catch(Exception e)
		{
			status=false;
			System.out.println("Unable to send teh data to the element "+elementName+" on the page "+pageName);
			System.out.println(e.getMessage());
		}		
		
		return status;
		
	}
	

}
