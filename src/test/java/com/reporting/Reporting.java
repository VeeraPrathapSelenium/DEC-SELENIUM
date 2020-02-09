package com.reporting;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporting {
	
	public static ExtentReports extent;
	
	public static ExtentTest test;
	
	public void intializeReport() {
		
		extent=new ExtentReports(getResultPath()+"\\TestSummary.html");
		extent.addSystemInfo("Environament","QA").
		addSystemInfo("Sprint #","2").
		addSystemInfo("Cycle","2");
		
	}
	
	
	public void startReport(String testName) {
		test=extent.startTest(testName);
	}
	
	public void logEvent(String status,String description) {
		
		switch (status.toLowerCase()) {
		case "pass":
			test.log(LogStatus.PASS, description);
			break;
			
		case "fail":
			test.log(LogStatus.FAIL, description);
			break;
			
		case "error":
			test.log(LogStatus.ERROR, description);
			break;
		case "warning":
			test.log(LogStatus.WARNING, description);
			break;

		default:
			break;
		}
		
	}
	
	public void endTest() {
		
		extent.endTest(test);
		
	}
	
	public void flushReport() {
		extent.flush();
	}
	
	
	
	
	
	
	
	

	public String getResultPath() {
		String resultpath = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
			Date d = new Date();

			String crntDate = sdf.format(d);

			
			
			resultpath = System.getProperty("user.dir")+"\\Results\\" + crntDate;
			File f = new File(resultpath);

			if (!f.exists()) {
				f.mkdirs();
			}

		} catch (Exception e) {

		}

		return resultpath;

	}

}
