package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShippingAdd {


		WebDriver driver;
			
			public ShippingAdd(WebDriver driver)
			
			{
				this.driver=driver;
				PageFactory.initElements( driver,this);
			}
			
				@FindBy(name="street[0]")
				WebElement street;
				
				@FindBy(name="city")
				WebElement City;
//				
//				
				@FindBy(name="region_id")//select
				WebElement region;
//				
				@FindBy(name="postcode")
				WebElement code;
//				
				@FindBy(name="country_id")
				WebElement country;
//				
				@FindBy(name="telephone")
				WebElement phno;
				
				@FindBy(xpath  ="//button[@data-role='opc-continue']")
				WebElement button;
				
				
				public void Street(String streetadd)
				{
					street.sendKeys(streetadd);
				}
				
				public void city(String cityy)
				{
					City .sendKeys(cityy);
				}
				
				public void Code(String zip)
				{
					code .sendKeys(zip);
				}
			
				public void Countrycode()
				{
					Select oselect = new Select(country);
					oselect.selectByVisibleText("India");
				}

				public void Region()
				{
					Select oselect = new Select(region);
					oselect.selectByVisibleText("Karnataka");
				}
				
				public void Telephone(String tele)
				{
					phno .sendKeys(tele);
				}
	
				public void Submit()
				{
					button.click();
				}
				
				
				
}
