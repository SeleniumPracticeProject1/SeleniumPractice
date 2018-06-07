package com.practiceActiTime.testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha
 *
 */
public class HandleAlertWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://irctc.co.in");
		
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		driver.findElement(By.id("usernameId")).sendKeys("admin",Keys.TAB,"admin");

	}

}
