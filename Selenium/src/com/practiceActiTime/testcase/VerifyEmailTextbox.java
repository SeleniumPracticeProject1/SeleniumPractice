package com.practiceActiTime.testcase;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * 
 * @author Namitha K
 *
 */
public class VerifyEmailTextbox {

	public static void main(String[] args) {
		/*Step 1 : Navigate to gmail.com*/
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		
		
		/*Capture the textbox Elemant*/
		WebElement wb = driver.findElement(By.id("identifierId"));
		
		/*Step 2(i) : Capture the default or placeholder*/
		String expectedPlaceholder = "Email or phone";
		String actualPlaceholder = wb.getAttribute("aria-label");
		if(actualPlaceholder.equals(expectedPlaceholder))
			System.out.println("Place holder is verified == PASS");
		else
			System.out.println("Place holder is not verified == FAIL");
		
		/*Step 2(ii) : Capture height and width of textbox*/
		Dimension dim = wb.getSize();
		System.out.println("Height = "+dim.getHeight());
		System.out.println("Width == "+dim.getWidth());
		
		/*Step 2(iii) : Capture the location of textbox*/
		org.openqa.selenium.Point p = wb.getLocation();
		System.out.println("X coordinate==>"+ p.getX());
		System.out.println("Y coordinate==>"+p.getY());
		
		/*Close the browser*/
		driver.close();

	}

}
