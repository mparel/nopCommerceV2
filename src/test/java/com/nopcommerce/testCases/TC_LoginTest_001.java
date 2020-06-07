package com.nopcommerce.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LoginPage;
//import org.testng.annotations.Test;
//
//import com.nopcommerce.pageObjects.LoginPage;
//
//import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws InterruptedException, IOException {
		driver.get(baseURL);
			
		LoginPage lp = new LoginPage(driver);
		
		lp.clearUserName();
		lp.setUserName(username);
		logger.info("User provided"); //logger msg
		
		lp.clearPassword();
		lp.setPassword(password);
		logger.info("Password provided");//logger msg
		
		lp.clickLogin();
		logger.info("Login in Clicked");//logger msg
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Thread.sleep(5000);
			lp.clickLogout();
			Assert.assertTrue(true);
			logger.info("Login Passed");//logger msg
			
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login Failed");//logger msg
		}

	}
}
