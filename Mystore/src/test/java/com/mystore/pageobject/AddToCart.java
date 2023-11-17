package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	
	WebDriver driver;
	
	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}

		@FindBy(xpath="//div[@id='option-label-size-143-item-170']")
		WebElement size;
		
		
		@FindBy(xpath="//div[@id='option-label-color-93-item-53']")
		WebElement shirtcolor;
		
		@FindBy(xpath="//input[@id='qty']")
		WebElement qtty;
		
		@FindBy(xpath="//button[@id='product-addtocart-button']")
		WebElement Atc;
		
		@FindBy(xpath="//a[normalize-space()='shopping cart']")
		WebElement shopcart;
		
		public void Size()
		{
			size.click();
		}
		
		public void ShirtColor()
		{
			shirtcolor.click();
		}

		public void Quantity(String Qtty)
		{
			qtty.clear();
			qtty.sendKeys(Qtty);
		}
		
		public void Addtocart()
		{
			Atc.click();
		}
		
		public void Shopcart()
		{
			shopcart.click();
		}
}
