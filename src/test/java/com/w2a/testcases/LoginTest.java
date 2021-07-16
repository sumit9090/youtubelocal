package com.w2a.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LoginTest extends TestBase{
	@Test
	public void loginasBankManahger() throws InterruptedException
	{
		//driver.findElement(By.xpath(OR.getProperty("bankmanagerloginbtn_XPATH"))).click();
		click("bankmanagerloginbtn_XPATH");
		Thread.sleep(9000);
		System.out.println("wow");
	//	Assert.fail("intentially failing the test");
		//Assert.assertTrue(isElementPresent(By.cssSelector("addCustBtn_CSS")),"login not sucessfull");
	}
	
	
	@Test
	public void loginasnewbankmanaer() throws IOException 
	{
		verifyEquals("1","1");
	}

}
