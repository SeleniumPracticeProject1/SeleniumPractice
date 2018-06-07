package com.practiceActiTime.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Namitha
 *
 */
public class DynamicApplicationWaitTest {

	public static void main(String[] args) {
		/*Launch the browser and navigate to times of india page*/
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://timesofindia.indiatimes.com/");
		driver.manage().window().maximize();
		
//	/*	WebDriverWait wait = new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sunday Times")));*/
		
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver);
		fWait.pollingEvery(5, TimeUnit.SECONDS);
		fWait.withTimeout(2, TimeUnit.MINUTES);
		fWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Kannada Movies']")));
		
		driver.findElement(By.xpath("//a[text()='Kannada Movies']")).click();

	}

}
