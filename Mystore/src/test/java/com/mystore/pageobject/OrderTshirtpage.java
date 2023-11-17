package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderTshirtpage {

WebDriver driver;
	
public OrderTshirtpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements( driver,this);
}

	@FindBy(xpath="//a[@class='product-item-link'][normalize-space()='Balboa Persistence Tee']")
	WebElement tshirt;
	
	public void Tshirt()
	{
		tshirt.click();
	}
}
