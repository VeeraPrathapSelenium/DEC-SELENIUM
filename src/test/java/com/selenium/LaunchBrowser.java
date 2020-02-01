package com.selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.commonutils.CommonUtils;

public class LaunchBrowser extends CommonUtils {

	

	public static void main(String[] args) throws IOException, InterruptedException {

		CommonUtils utils=new CommonUtils();
		utils.loadExcel();
		
		utils.launchBrowser();
		
		Thread.sleep(2000);
		
		
		//utils.driver.findElement(By.xpath("(//a[normalize-space(text())='Computers'])[1]")).click();
		WebElement register=utils.driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		
		//firstname
		//
		String firstname_data=utils.getData("TestData", "Tc_01", 1, "FirstName");
		
		WebElement firstanme=utils.driver.findElement(By.xpath("//input[contains(@id,'FirstName')]"));
		
		utils.clickAndSendData("First Name", "Registration", firstanme, firstname_data);
		
		//lastname
		String lastname_data=utils.getData("TestData", "Tc_01", 1, "LastName");
		WebElement lastname=utils.driver.findElement(By.xpath("//input[@id='LastName']"));
		utils.clickAndSendData("Last Name", "Registration", lastname, lastname_data);

		//email
		String email_data=utils.getData("TestData", "Tc_01", 1, "Email");
		WebElement email=utils.driver.findElement(By.xpath("//input[@id='Email']"));
		utils.clickAndSendData("Email", "Registration", email, email_data);
		
		//date of birth
		WebElement dob=utils.driver.findElement(By.xpath("//select[@name='DateOfBirthDay']/option[@value='6']"));
		dob.click();
		
		
		//print the size of the childern
		List<WebElement> allchilds=utils.driver.findElements(By.xpath("//select[@name='DateOfBirthDay']/child::option"));
		
		System.out.println(allchilds.size());
		
		
		System.out.println("**************** Option Tags Text Value *********************");
		
		for (WebElement webElement : allchilds) {
			System.out.println(webElement.getText());
		}
		
		System.out.println("**************** Get the value of first Name *********************");
		
		String prefillvalue=firstanme.getAttribute("value");
		System.out.println(prefillvalue);
		
		
		//get the css value
		
		WebElement element=utils.driver.findElement(By.xpath("//h1[text()='Register']"));
		System.out.println(element.getCssValue("font-size"));
		System.out.println(element.getCssValue("color"));
	}

}
