package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop  {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		WebElement iframe=driver.findElement(By.xpath("//iframe"));
		
       driver.switchTo().frame(iframe);
       
       
       WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
       
       WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
       
       Actions action=new Actions(driver);
	   action.dragAndDrop(src, dest).build().perform();
	   
	   driver.switchTo().defaultContent(); 
       
       
       
	}

}
