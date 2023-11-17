package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indexpage {
	
	WebDriver driver;
	public Indexpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
	WebElement account;
	
	@FindBy(id="firstname")
	WebElement firstname;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	@FindBy(name="email")
	WebElement mail;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="password_confirmation")
	WebElement confirmation;
	
	@FindBy(xpath ="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	WebElement submit;
	
	
	public void createAcc() 
	{
		account.click();
	}
	
	public void firstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void lastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	
	public void email(String email)
	{
		mail.sendKeys(email);
	}
	
	public void paas(String paas)
	{
		password.sendKeys(paas);
	}
	
	public void confirm(String confirmpaas)
	{
		confirmation.sendKeys(confirmpaas);
	}
	
	public void Submit()
	{
		submit.click();
	}
}
