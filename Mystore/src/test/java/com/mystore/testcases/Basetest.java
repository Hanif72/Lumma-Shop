package com.mystore.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mystore.utilies.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {

	ReadConfig rc = new ReadConfig();
	
	String  url = rc.getbaseurl();
	String browser= rc.getbrowser();
	
	String emailAdd = rc.emailAdd();
	String passwdAdd = rc.PassAdd();
	
	WebDriver driver;
	
	@BeforeClass
			public void setup()
			{
//		driver.manage().window().maximize();
				if(browser.equalsIgnoreCase("chrome"))
				{
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				}
				
				else if (browser.equalsIgnoreCase("edge"))
				{
					WebDriverManager.edgedriver().setup();
					 driver = new EdgeDriver();			
				}
				
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.get(url);
			}
			
	
	
//			@AfterClass
			public void teardown()
			
			{
				driver.close();
				driver.quit();
			}
			
public void captureScreenshot(WebDriver driver, String testname) throws IOException
{
	TakesScreenshot screenshot =((TakesScreenshot)driver);
	
	File src= screenshot.getScreenshotAs(OutputType.FILE);
	
	File dest = new File(System.getProperty("user.dir")+"//Screenshots//"+ testname+".png");
	FileUtils.copyFile(src, dest);
	
}

}
