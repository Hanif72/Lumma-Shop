package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut {

	WebDriver driver;
	public SignOut(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  = "//div[@class='panel header']//button[@type='button']")
	WebElement change;
	
	@FindBy(xpath ="//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
	WebElement signout;
	
	public void Change() 
	{
		change.click();
	}
	
	
	public void Signout() 
	{
		signout.click();
	}
}
