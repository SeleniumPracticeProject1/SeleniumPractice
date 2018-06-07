package com.practiceActiTime.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha
 *
 */
public class ComplexXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///E:/Selenium/ComplexXpath.html");
		
		WebElement androidAddToCart = driver.findElement(By.xpath("//div[@name='android']/input[@value='add to cart']"));
		
		WebElement androidCancel = driver.findElement(By.xpath("//div[@name='android']/input[@value='cancel']"));
		
		WebElement appleAddToCart = driver.findElement(By.xpath("//div[@name='apple']/input[@value='add to cart']"));
		
		WebElement appleCancel = driver.findElement(By.xpath("//div[@name='apple']/input[@value='cancel']"));
		
		androidAddToCart.click();
		
		androidCancel.click();
		
		appleAddToCart.click();
		
		appleCancel.click();
		
		driver.close();
		

	}

}
