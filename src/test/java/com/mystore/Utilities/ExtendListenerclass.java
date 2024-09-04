package com.mystore.Utilities;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendListenerclass implements ITestListener {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;


	public void configureReport() {
		htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);

		// add environment details
		reports.setSystemInfo("Machine", "test pc1");
		reports.setSystemInfo("OS", "window 11");
		reports.setSystemInfo("Browser", "chrome");
		reports.setSystemInfo("user", "prachi");
		
		// configuration to change look and feel
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report ");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE,MMMM dd,yyyy, hh:mm a '('zzz')");

	}

	@Override
	public void onStart(ITestContext result) {
		configureReport();
		System.out.println("when start method evoked...."); // it execute only one time
	//	System.out.println("Test Standard :" + result.getName());
	}

	public void onFinish(ITestContext result) {
		System.out.println("when finish method evoked....");
		reports.flush(); // it is madetory to ensure information is written to the started reporter
	}

	
	//when test case get failed, this method is called
	
	public void onTestFailure(ITestResult Result) {
		System.out.println("name of test method is filed :"+Result.getName());
		test = reports.createTest(Result.getName());   // create empty in html report
		test.log(Status.FAIL,MarkupHelper.createLabel("name of failed test case is :"+Result.getName(), ExtentColor.RED));
		
		//Screenshot
		
		String screenshotPath =System.getProperty("user.dir")+"\\Screenshots\\"+Result.getName()+".png";
		File screenshotfile = new File(screenshotPath);
		
		if(screenshotfile.exists()) {
			test.fail("captured screenshot below :"+test.addScreenCaptureFromPath(screenshotPath));
		}
		
		
	//	test.addScreenCaptureFromPath("");
	}
	
	//when test case get skipped, this method is called
	
		public void onTestskipped(ITestResult Result) {
			System.out.println("name of test method is skipped :"+Result.getName());
			test = reports.createTest(Result.getName());   // create empty in html report
			test.log(Status.SKIP,MarkupHelper.createLabel("name of skipped test case is :"+Result.getName(), ExtentColor.YELLOW));
		}
	
		
		//when test case get started, this method is called
		
		public void onTestStart(ITestResult Result) {
			System.out.println("name of test method is filed :"+Result.getName());
			
		}
		
		//when test case get passed, this method is called
		
		public void onTestSuccess(ITestResult Result) {
			System.out.println("name of test method is succesfully executed :"+Result.getName());
			test = reports.createTest(Result.getName());   // create empty in html report
			test.log(Status.PASS,MarkupHelper.createLabel("name of passed test case is :"+Result.getName(), ExtentColor.GREEN));
		}
	
		//when test case get failed, this method is called
		
		public void onTestFailureButWithinSuccessPercentage(ITestResult Result) {
			// keep empty
		}
	
	
}
