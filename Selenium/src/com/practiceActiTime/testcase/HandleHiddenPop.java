package com.practiceActiTime.testcase;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * 
 * @author Namitha
 *
 */
public class HandleHiddenPop {

	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriverServer\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer\\IEDriverServer.exe");

	}
	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriverServer\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://redbus.in");
		
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		
		while(true) 
		{
			try
			{
				driver.findElement(By.xpath("//td[text()='Dec 2018']"));
				driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::td[text()='28']")).click();
				break;
			}
			catch(Throwable e)
			{
				driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::button[text()='>']")).click();
			}
		}
		Thread.sleep(3000);
		
		driver.close();

	}

}
