package com.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mystore.pageobject.AddToCart;
import com.mystore.pageobject.CheckOutCart;
import com.mystore.pageobject.Indexpage;
import com.mystore.pageobject.OrderTshirtpage;
import com.mystore.pageobject.PlaceOrder;
import com.mystore.pageobject.RegisteredLogin;
import com.mystore.pageobject.SearchProduct;
import com.mystore.pageobject.ShippingAdd;
import com.mystore.pageobject.SignIn;
import com.mystore.pageobject.SignOut;
import com.mystore.pageobject.VerifyUsername;

import junit.framework.Assert;

public class MyAccount extends Basetest {

	
	@Test(enabled = false)
	public void verifyregistrationandlogin() throws InterruptedException
	{
		
		
		Indexpage ip =new Indexpage(driver);
		
		ip.createAcc();
		ip.firstname("Mohammed Hanif ");
		ip.lastname("Naib");
		ip.email(emailAdd);
		ip.paas(passwdAdd);
		ip.confirm(passwdAdd);
		ip.Submit();
		
		
		Thread.sleep(5000);
		
		SignOut so= new SignOut(driver);
		so.Change();
		so.Signout();
		
		Thread.sleep(10000);
		
		SignIn si = new SignIn(driver);
		si.Signin();
		si.mail(emailAdd);
		si.paasword(passwdAdd);
		si.Submit();
		
		Thread.sleep(5000);
		
		VerifyUsername vu = new VerifyUsername(driver);
		String user= vu.username();
		Assert.assertEquals("Welcome, Mohammed Hanif Naib!", user);
	}
	
		
		@Test(enabled = false)
		public void RegistLogin() throws IOException
		{
			SignIn si = new SignIn(driver);
			si.Signin();
			
			RegisteredLogin rl= new RegisteredLogin(driver);
			rl.email(emailAdd);
			rl.password(passwdAdd);
			rl.Submit();
			
			VerifyUsername vu = new VerifyUsername(driver);
			String user= vu.username();
			if(user.equals("Welcome, Mohammed Hanif Naib!"))
			{
				Assert.assertTrue(true);
			}
			else
				{
				captureScreenshot(driver, "RegistLogin");
				Assert.assertTrue(false);
				}
		}
		
		@Test
		public void verifysearchproduct() throws InterruptedException
		{
			SignIn si = new SignIn(driver);
			si.Signin();
			
			RegisteredLogin rl= new RegisteredLogin(driver);
			rl.email(emailAdd);
			rl.password(passwdAdd);
			rl.Submit();
			
			SearchProduct sp = new  SearchProduct(driver);
			sp.Search("T shirt for men");
			sp.Srchbttn();
			
			OrderTshirtpage otp = new OrderTshirtpage(driver);
			otp.Tshirt();
			
			AddToCart atc= new AddToCart(driver);
			atc.Size();
			atc.ShirtColor();
			atc.Quantity("3");
			atc.Addtocart();
			Thread.sleep(3000);
			atc.Shopcart();
			
			CheckOutCart coc = new CheckOutCart(driver);
			Thread.sleep(3000);
			coc.newqtty("2");
			coc.Update();
			Thread.sleep(5000);
			coc.Proceed();
			
			Thread.sleep(5000);
			
			ShippingAdd sa = new ShippingAdd(driver);
			Thread.sleep(3000);
			sa.Street("2601 West 7th St. Fort Worth, Texas 76107. (817)877-1977. Apartment Rent Rebate.");
			sa.city("Mumbai");
			
			sa.Countrycode();
			sa.Region();
			sa.Code("88595");
		
			sa.Telephone("6649825036");
//			
			sa.Submit();
			Thread.sleep(5000);
			PlaceOrder pc= new PlaceOrder(driver);
			Thread.sleep(5000);
			pc.placeOrder();
			
			
//			SignOut so= new SignOut(driver);
//			so.Change();
//			so.Signout();
		}
	}
	

