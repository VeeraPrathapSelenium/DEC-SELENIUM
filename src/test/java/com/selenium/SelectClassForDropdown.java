package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.commonutils.CommonUtils;

public class SelectClassForDropdown {

	public static void main(String[] args) throws IOException, InterruptedException {
		CommonUtils utils=new CommonUtils();
		utils.loadExcel();
		
		utils.launchBrowser();
		
		Thread.sleep(2000);
		
		
		//utils.driver.findElement(By.xpath("(//a[normalize-space(text())='Computers'])[1]")).click();
		WebElement register=utils.driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		
		WebElement dob=utils.driver.findElement(By.cssSelector("select[name*='DateOfBirthDay']"));
		Select select=new Select(dob);
		
		select.selectByVisibleText("17");
		Thread.sleep(1000);
		
		select.selectByValue("2");
		Thread.sleep(1000);
		select.selectByIndex(0);
	}

}
