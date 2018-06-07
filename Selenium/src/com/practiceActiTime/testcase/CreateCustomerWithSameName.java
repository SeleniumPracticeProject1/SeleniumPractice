package com.practiceActiTime.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha K
 *
 */
public class CreateCustomerWithSameName {

	public static void main(String[] args) throws InterruptedException {
		/*test Data*/
		String userName = "admin";
		String password = "manager";
		String customerName = "HDFC001";
		String exceptedMsg = "already exists. Please choose other customer name.";
		
		/*Step 1 : Login to Application*/
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=9t5u9tr14je77");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(6000);
		
		/*Step 2 : Navigate to Task Page*/
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		Thread.sleep(2000);
		
		/*Step 3: Navigate to Projects & Customers*/
		driver.findElement(By.linkText("Projects & Customers")).click();
		Thread.sleep(2000);
		
		/*Step 4 : Navigate to Create new customer*/
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		
		/*Step 5 : Create new customer  */
		driver.findElement(By.name("name")).sendKeys(customerName);
		driver.findElement(By.name("createCustomerSubmit")).click();
		Thread.sleep(2000);
		
		/*ER: Customer creation successful message*/
		String actualMsg = driver.findElement(By.xpath("//span[@class='errormsg']")).getText();
		System.out.println(actualMsg);
		if(actualMsg.contains(exceptedMsg))
			System.out.println("Customer already exists=PASS");
		else
			System.out.println("Customer created=FAIL");
		
		/*Logout*/
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
	}

}
