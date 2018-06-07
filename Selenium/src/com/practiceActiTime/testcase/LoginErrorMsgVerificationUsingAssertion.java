package com.practiceActiTime.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(com.actiTime.genericLibs.SampleListener.class)
public class LoginErrorMsgVerificationUsingAssertion {

	public static WebDriver driver;
	@BeforeClass
	public void configBC()
	{
		driver = new FirefoxDriver();
		driver.get("http://localhost/login.jsp");
	}
	
	@Test
	public void VerifyErrorMsgTest()
	{
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"managareteg",Keys.ENTER);
		String expectedMsg = "Username or Password is invalid.";
		String actualMsg = driver.findElement(By.xpath("(//span[@class='errormsg'])[1]")).getText();
		Assert.assertEquals(actualMsg, expectedMsg);
	}
	
	
	@Test
	public void VerifyLogoDisplay()
	{
		boolean status = driver.findElement(By.xpath("//img[contains(@src,'logo')]")).isDisplayed();
		SoftAssert ast = new SoftAssert();
		ast.assertTrue(status);
		Reporter.log("Logo is displayed", true);
	}
	
	@AfterClass
	public void configAC()
	{
		driver.close();
	}
}
