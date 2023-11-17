package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='search']")
	WebElement Search;
	
	
	@FindBy(xpath="//button[@title='Search']")
	WebElement searchbutton;
	
	public SearchProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}

	public void Search(String search)
	{
		Search.sendKeys(search);
	}
	
	public void Srchbttn()
	{
		searchbutton.click();
	}
}
