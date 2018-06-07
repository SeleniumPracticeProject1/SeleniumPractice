package com.practiceActiTime.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		/*WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("namitha.shridhar@ovi.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("");
		
		WebElement login = driver.findElement(By.id("u_0_2"));
		login.click();*/
		
		Select dSel = new Select(driver.findElement(By.id("day")));
		dSel.selectByVisibleText("28");
		
		Select mSel = new Select(driver.findElement(By.id("month")));
		mSel.selectByIndex(5);
		
		Select ySel = new Select(driver.findElement(By.id("year")));
		ySel.selectByVisibleText("1996");
		
		driver.close();

	}

}
