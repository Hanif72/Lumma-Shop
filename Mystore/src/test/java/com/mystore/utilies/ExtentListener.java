package com.mystore.utilies;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListener implements ITestListener{

	ExtentSparkReporter esr ;
	ExtentReports report = new ExtentReports();
	ExtentTest test;
	
	public void configreport()
	{
		esr= new ExtentSparkReporter("LumaShoppingReport.html");
		report= new ExtentReports();
		report.attachReporter(esr);
		
		esr.config().setDocumentTitle("Luma Shopping");
		esr.config().setReportName("Luma Report");
		esr.config().setTheme(Theme.DARK);
		
		report.setSystemInfo("Machine", "Dell");
		report.setSystemInfo("OS", "W13");
		report.setSystemInfo("user", "Mr. Hanif");
		
	}
	
	public void onStart(ITestContext re)
	{
		configreport();
		System.out.println("The start Test method invoked.......");
	}
	
	public void onFinish(ITestContext re)
	{
		System.out.println("The Finish Test method invoked.......");
		report.flush();
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("The Method name Passed is :." +result.getName());
		test=report.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("The Method passed is: "+result.getName(),ExtentColor.WHITE));
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("The Method name Skipped is :." +result.getName());
		test=report.createTest(result.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel("The method Skipped is  "+result.getName(), ExtentColor.ORANGE));
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("The Method name Failed is :." +result.getName());
		test=report.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel("The method Failed is  "+result.getName(), ExtentColor.INDIGO));
		
		String ScreenShotspath = System.getProperty("user.dir")+"\\Screenshots\\"+result.getName()+".png";
		File  ScreenShotFile = new File(ScreenShotspath);
		
		if(ScreenShotFile.exists())
		{
			test.fail("Captured ScreenShot is below :"+ test.addScreenCaptureFromPath(ScreenShotspath));
			
		}
		
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("The Method name started is :." +result.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	
}
