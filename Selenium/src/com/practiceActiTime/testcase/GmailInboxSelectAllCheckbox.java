package com.practiceActiTime.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha
 *
 */
public class GmailInboxSelectAllCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("namitha029", Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("nihal@!*", Keys.ENTER);

	}

}
