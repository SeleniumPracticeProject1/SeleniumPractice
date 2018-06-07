package com.practiceActiTime.testcase;
/**
 * 
 * @author Namitha
 *
 */

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScreenshotExampleTest {
	WebDriver driver;
	@BeforeClass
	public void configBC()
	{
		driver = new FirefoxDriver();
		driver.get("https://gmail.com");
	}
	
	@Test
	public void ScreenshotTest() throws Throwable
	{
		EventFiringWebDriver screenshot = new EventFiringWebDriver(driver);
		File scr = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dst = new File("./Screenshots/Flipkart.png");
		FileUtils.copyFile(scr, dst);
	}
	
	
	@AfterClass
	public void configAC()
	{
		driver.close();
	}
}
