package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {

	
	WebDriver driver;
	
	public PlaceOrder(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Place Order']")
	WebElement placeorder;

	
	public void placeOrder()
	{
		placeorder.click();
	}
}
