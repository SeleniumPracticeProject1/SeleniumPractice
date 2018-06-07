package com.practiceActiTime.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha K
 *
 */
public class VerifyLoginErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		/*Test Data*/
		String username = "admin";
		String wrongPassword = "abc123";
		
		/*Step 1 : Navigate to ActiTIme application*/
		WebDriver driver = new FirefoxDriver();
		driver.get("http://desktop-o4l6frn/login.do");
		
		/*Step 2 : Verify Login Page */
		String expectedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
			System.out.println("Login Page is Verified == PASS");
		else
			System.out.println("Login page is not verified == FAIL");
		
		/*Step 3 : Enter invalid password and click on login button*/
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(wrongPassword);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		
		/*Step 4 : Verify Error msg*/
		String expectedMsg = "Username or Password is invalid. Please try again.";
		WebElement wbe = driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
		String actualMsg = wbe.getText();
		if(actualMsg.equals(expectedMsg))
			System.out.println("Error msg is verified == PASS");
		else
			System.out.println("Error Msg is not verified == FAIL");
		
		/*Verify Color of error msg*/
		String actualColor = wbe.getCssValue("color");
		System.out.println(actualColor);
		if(actualColor.equals("rgba(206, 1, 0, 1)"))
			System.out.println("Error msg is in red color == PASS");
		else
			System.out.println("Error msg not in red color == FAIL");
		
		
		driver.close();
		
		//driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
	}

}
