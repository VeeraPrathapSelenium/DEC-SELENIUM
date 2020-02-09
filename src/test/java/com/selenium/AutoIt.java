package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Runtime.getRuntime().exec("C:\\Users\\tm\\Desktop\\Fileupload.exe");
		WebDriver driver=new ChromeDriver();
		WebElement element=driver.findElement(By.id(""));
		JavascriptExecutor js=(JavascriptExecutor )  driver;
		js.executeScript("arguments[0].click();",element);
		
	}

}
