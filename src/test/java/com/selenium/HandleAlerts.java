package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(6000);
		
		WebElement signIn=driver.findElement(By.xpath("//input[@value='Sign in']"));
		signIn.click();
		
		
		Alert alert=driver.switchTo().alert();
		alert.accept();

	}

}
