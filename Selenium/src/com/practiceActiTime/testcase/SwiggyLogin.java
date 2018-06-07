package com.practiceActiTime.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha K
 *
 */
public class SwiggyLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.swiggy.com/");
		
		driver.findElement(By.xpath("//a[@class='x4bK8']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("mobile")).sendKeys("8197400546");
		driver.findElement(By.id("password")).sendKeys("namitha8197");
		driver.findElement(By.className("a-ayg")).click();
		

	}

}
