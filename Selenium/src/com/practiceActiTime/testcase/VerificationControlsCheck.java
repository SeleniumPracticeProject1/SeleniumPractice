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
 * @author Namitha K
 *
 */

public class VerificationControlsCheck {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		/*Explicit Wait*/
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='irfooterlink']")));
		
		/*Fluent Wait*/
		//FluentWait<T> wait = new FluentWait<T>(driver);
		
		
		/*Implicit Wait*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		/*isDisplay() method*/
		boolean dAns =  driver.findElement(By.id("nlpCaptchaImg")).isDisplayed();
		System.out.println(dAns);
		if(dAns)
			System.out.println("Image is Displayed == PASS");
		else
			System.out.println("Image is not dispalyed == FAIL");
		
		/*isEnabled() method*/
		boolean eAns = driver.findElement(By.id("loginbutton")).isEnabled();
		System.out.println(eAns);
		if(eAns)
			System.out.println("Button is Enabled ===PASS");
		else
			System.out.println("Button is diabled == FAIL");
		
		/*isSelected() method*/
		boolean sAns = driver.findElement(By.id("otpId")).isSelected();
		System.out.println(sAns);
		if(sAns)
			System.out.println("CheckBox is already selected == FAIL");
		else
			System.out.println("Checkbox is not selected == PASS");
	}

}
