package com.practiceActiTime.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 * @author Namitha
 *
 */
public class AutoSuggestEditBox {

	public static void main(String[] args) throws InterruptedException {
		/*Launch the browser*/
		WebDriver driver = new FirefoxDriver();
	
		/*Maximize the window*/
		driver.manage().window().maximize();
		
		/*Navigate to google.com*/
		driver.get("https://google.com");
		
		//WebElement web = driver.findElement(By.id("lst-ib"));
		
		/*Identify the element*/
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		
		/*Create object to driver class*/
		Actions act = new Actions(driver);
		
		/*Perform zoom in operation i.e Press ctrl+ADD twice*/
		act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD),Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
		
		Thread.sleep(2000);
		
		/*Perform zoom out operation i.e Press ctrl+SUBTRACT twice*/
		act.sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT),Keys.chord(Keys.CONTROL,Keys.SUBTRACT)).perform();
		
		/*Press arrow_down key twice*/
		act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
		/*Press ENTER button from the keyboard*/
		act.sendKeys(Keys.ENTER).perform();
		
		/*Perform right-click operation
		act.contextClick(web).perform();*/
		
		/*Close the browser*/
		driver.close();
	}

}
