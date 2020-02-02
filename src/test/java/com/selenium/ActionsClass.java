package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.commonutils.CommonUtils;

public class ActionsClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		CommonUtils utils=new CommonUtils();
		utils.loadExcel();
		
		utils.launchBrowser();
		
		Thread.sleep(2000);
		
		WebElement computer=utils.driver.findElement(By.xpath("(//a[normalize-space(text())='Computers'])[1]"));

		Actions action=new Actions(utils.driver);
		action.moveToElement(computer).build().perform();
		
		action.moveToElement(computer).click(computer).build().perform();
		
		
		
	}

}
