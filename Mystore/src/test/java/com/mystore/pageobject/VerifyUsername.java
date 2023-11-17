package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyUsername {
	
	WebDriver driver;
	
	public VerifyUsername(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  ="//div[@class='panel header']//span[@class='logged-in'][normalize-space()='Welcome, Mohammed Hanif Naib!']")
	WebElement username;
	
	
	public String username() 
	{
	String user=username.getText();
	return user;
	}
}
