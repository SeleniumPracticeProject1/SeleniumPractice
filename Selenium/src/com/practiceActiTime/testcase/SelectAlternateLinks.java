package com.practiceActiTime.testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha
 *
 */
public class SelectAlternateLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);

		
		
		List<WebElement> aLinks = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<aLinks.size();i++)
		{
			//System.out.println(aLinks.get(i).getCssValue("color"));
			if(aLinks.get(i).getCssValue("color").equals("rgba(26, 13, 171, 1)"))
			{
				System.out.println(aLinks.get(i).getText());
			}
		}
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
