package com.mystore.Utilities;


import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtendReportclass implements ITestListener  {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void startReport() {
		htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add environment details
		reports.setSystemInfo("Machine", "test pc1");
		reports.setSystemInfo("OS", "window 11");
		reports.setSystemInfo("user", "prachi");
		reports.setSystemInfo("Browser", "chrome");
		
		//configuration to change look and feel
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report ");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE,MMMM dd,yyyy, hh:mm a '('zzz')");
		
		
		
	}
	
	@Test
	public void launchBrowserAndOpenUrl() {
		//create test
	test=	reports.createTest("Launch browser and open url");
		Assert.assertTrue(true);    //test passed
		
	}
	
	@Test
	public void verifyTitle() {
		//create test
	test=	reports.createTest("verify title");
		Assert.assertTrue(false);    //test failed
		
	}
	
	
	@Test
	public void verifylogo() {
		//create test
	test=	reports.createTest("verify title");
		Assert.assertTrue(true);    //test passed
		
	}
	
	
	@Test
	public void verifyEmail() {
		//create test
	test=	reports.createTest("verify email");
	throw new SkipException("skipping this test case with exception");
	   //test skip
		
	}
	
	@Test
	public void verifyUserName() {
		//create test
	test=	reports.createTest("verify username");
	Assert.assertTrue(true); //testPass
		
	}
	
	
	@AfterMethod
	public void getTestResult(ITestResult result) {
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() +" Fail ", ExtentColor.RED));
		test.fail(result.getThrowable());
	}else if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() +" pass ", ExtentColor.GREEN));
	}else if(result.getStatus()==ITestResult.SKIP) {
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() +" skipped ", ExtentColor.YELLOW));
	}
		
	}
	
	
	@AfterTest
	public void teardown() {
		reports.flush();
	}
	
	
	
	
	
	
	
}
