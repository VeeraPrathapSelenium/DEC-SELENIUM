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
		//List<WebElement> alllinks=utils.driver.findElements(By.xpath("//a"));
		List<WebElement> alllinks=utils.driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links are "+alllinks.size());
		
		//iterate each link
		
		for (WebElement webElement : alllinks) {
			
			try {
				
				//verify if the element get displayed
			if(webElement.isDisplayed())	
			{
				System.out.println(webElement.getText());
				
				
				
				String linkurl=webElement.getAttribute("href");
				
				if(!linkurl.isEmpty()) {
					URL url=new URL(linkurl);
					HttpURLConnection con=(HttpURLConnection)url.openConnection();
					int res_code=con.getResponseCode();
					System.out.println(res_code);
				}
				
				
				
				
				
				
				
				
				
				
			}
				
				
				
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
			
			
			
			
			
		}
		
		
		
	}

}
