package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisteredLogin {

	WebDriver driver;
	public RegisteredLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement mail;
	
	
	@FindBy(xpath="//fieldset[@class='fieldset login']//input[@id='pass']")
	WebElement paas;
	
	
	
	@FindBy(xpath="//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	WebElement submit;
	
	public void email(String email)
	{
		mail.sendKeys(email);
	}
	
	
	public void password(String passwd)
	{
		paas.sendKeys(passwd);
	}
	
	
	public void Submit( )
	{
		submit.click();
	}
	
}