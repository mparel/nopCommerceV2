package com.nopcommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);		
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Log in']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/ul/li[3]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	public void clearUserName()
	{
		txtEmail.clear();
	}
	
	public void setUserName(String uname)
	{
		txtEmail.sendKeys(uname);
	}
		
	public void clearPassword()
	{
		txtPassword.clear();
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
		
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	

}
