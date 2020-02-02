package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleWebTables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		
		FluentWait fw=new FluentWait(driver);
		
		fw.withTimeout(55,TimeUnit.SECONDS);
		fw.pollingEvery(2,TimeUnit.SECONDS);
		fw.ignoring(NoSuchElementException.class);
		
		fw.until(ExpectedConditions.visibilityOf(element));
		
		
		
			
		List<WebElement> rows=driver.findElements(By.xpath("//th[text()='Company']/ancestor::table/tbody/tr"));
		
		for(int r=1;r<=rows.size();r++) {
			
			String colxpath="//th[text()='Company']/ancestor::table/tbody/tr["+r+"]/td";
			
			List<WebElement> cols=driver.findElements(By.xpath(colxpath));
			
			for(int c=1;c<=cols.size();c++)
			{
				String dataXpath="//th[text()='Company']/ancestor::table/tbody/tr["+r+"]/td["+c+"]";
				
				WebElement celldata=driver.findElement(By.xpath(dataXpath));
				
				System.out.println(celldata.getText());
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
	}

}
