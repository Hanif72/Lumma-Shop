package com.mystore.utilies;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadConfig {

	Properties pr;
	
	String path = "C:\\Users\\mohammed hanif naib\\Desktop\\July_Selenium\\Mystore\\"
			+ "configuration\\config.properties";
	
	
	
	public ReadConfig() 
	{
	 try {
		FileReader fr = new FileReader(path);
		 pr = new Properties();
			pr.load(fr);
			} 
	 catch (IOException e)
	 		{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public String getbaseurl() 
	{
		String value=pr.getProperty("url");
		if(value!=null)
		{
			return value;
		}
		else
		{
			throw new RuntimeException("The Exception is in default");
			
		}
	}
	
	
	public String getbrowser() 
	{
		String value=pr.getProperty("browser");
		if(value!=null)
		{
			return value;
		}
		else
		{
			throw new RuntimeException("The Exception is occured");
		}
	}
	
		public String  emailAdd()
		{
		String email=	pr.getProperty("email");
		return email;
		}
		
		public String PassAdd()
		{
			String paas=pr.getProperty("paasword");
			return paas;
		}
		
}

	
