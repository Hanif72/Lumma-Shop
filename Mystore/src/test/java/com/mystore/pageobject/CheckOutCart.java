package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCart {

WebDriver driver;
	
	public CheckOutCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
		@FindBy(id="cart-303002-qty")
		WebElement qtty;
		
		@FindBy(xpath="//span[normalize-space()='Update Shopping Cart']")
		WebElement update;
		
		
		@FindBy(xpath="//span[normalize-space()='Proceed to Checkout']")
		WebElement proceed;
		
		public void newqtty(String Qtty)
		{
			qtty.clear();
			qtty.sendKeys(Qtty);
		}
		
		public void Update()
		{
			update.click();
		}
		
		public void Proceed()
		{
			proceed.click();
		}
}
