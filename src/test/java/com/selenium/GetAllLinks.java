package com.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.commonutils.CommonUtils;

public class GetAllLinks extends CommonUtils {

	

	public static void main(String[] args) throws IOException, InterruptedException {

		CommonUtils utils=new CommonUtils();
		utils.loadExcel();
		
		utils.launchBrowser();
		
		Thread.sleep(2000);
		
		WebElement search=utils.driver.findElement(By.xpath("//input[@id='small-searchterms']/following-sibling::input"));
		
		if(search.isEnabled()) {
			System.out.println("Search button is enabled");
		}else
		{
			System.out.println("Search button is not enabled");
		}
		
		//test is selected
		
WebElement gender=utils.driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		if(gender.isSelected()) {
			System.out.println("Gender button is selected");
		}else
		{
			System.out.println("Gender button is not selected");
		}
		
		
		
	}

}
