package com.selenium;



import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.google.common.annotations.VisibleForTesting;

public class TestProperties {
	
	
	@Test(priority=1,testName="Some name",description="some des",groups="smoke")
	@Parameters({ "Browser" })
	public void doTest(String browser)
	{
		System.out.println(browser);
		System.out.println("test2");
	
	}
	
	@Test(priority=3,groups="smoke")
	public void aTest()
	{
		System.out.println("test1");
	}
	@Test(priority=2,groups="regression")
	public void fTest()
	{
		System.out.println("test3");
	}
	
	
	

}
