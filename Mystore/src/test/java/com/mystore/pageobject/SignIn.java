package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

	WebDriver driver;
	public SignIn(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  ="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	WebElement signin;
	
	
	@FindBy(id="email")
	WebElement  mail;
	
	@FindBy(id="pass")
	WebElement  paas;
	
	@FindBy(id="send2")
	WebElement  submit;
	
	public void Signin() 
	{
		signin.click();
	}
	
	public void mail(String email)
	{
		mail.sendKeys(email);
	}
	
	public void paasword(String psss)
	{
		paas.sendKeys(psss);
	}
	
	public void Submit() 
	{
		submit.click();
	}
}
