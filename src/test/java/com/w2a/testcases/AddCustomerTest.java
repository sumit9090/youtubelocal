package com.w2a.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;


public class AddCustomerTest extends TestBase {

	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void addCustomerTest(Hashtable<String,String> data) throws InterruptedException
	{
		click("addCustBtn_CSS");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.cssSelector(OR.getProperty("firstname_CSS"))).sendKeys("1");
		type("firstname_CSS",data.get("firstname"));
		//driver.findElement(By.xpath(OR.getProperty("lastname_XPATH"))).sendKeys("1");
		type("lastname_XPATH",data.get("lastname"));
		//driver.findElement(By.cssSelector(OR.getProperty("postcode_CSS"))).sendKeys("1");
		type("postcode_CSS",data.get("postcode"));
		
		click("addbtn_CSS");
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		Thread.sleep(3000);
		Reporter.log("adding customer message ");
		
	}

}
