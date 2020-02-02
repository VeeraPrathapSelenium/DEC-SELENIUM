package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling  {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		//get parent id
		String parentId=driver.getWindowHandle();
		
		//collect all teh windows including parent and child
		Set<String> allwindows=driver.getWindowHandles();
		
		Iterator itr=allwindows.iterator();
		
		while(itr.hasNext())
		{
			String crntWindow=itr.next().toString();
			
			if(!crntWindow.equals(parentId)) {
				
				driver.switchTo().window(crntWindow);
				driver.close();
				Thread.sleep(2000);
				
			}
			
			driver.switchTo().window(parentId);
			
			
			
			
		}
		
		
		
		
		
		
	}

}
