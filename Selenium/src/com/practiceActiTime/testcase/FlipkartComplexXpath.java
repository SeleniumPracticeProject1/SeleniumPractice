package com.practiceActiTime.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 * @author Namitha
 *
 */
public class FlipkartComplexXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		/*driver.findElement(By.name("q")).sendKeys("iphone 7");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(10000);
		
		String x="//div[text()='Apple iPhone 7 (Black, 32 GB)']/../following-sibling::div/div[1]/div/div";
		System.out.println(driver.findElement(By.xpath(x)).getText());
		*/
		
		/*Identify autosuggestEditBox, pass data and pass ENTER keyboard operation using Actions class*/
		driver.findElement(By.name("q")).sendKeys("mi note 5");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(10000);
		
		/*Identifying and Capturing price of Redmi note 5*/
		String miPrice = "//a[text()='Redmi Note 5 (Gold, 32 GB)']/following-sibling::a/div/div";
		System.out.println(driver.findElement(By.xpath(miPrice)).getText());
		
		/*Identifying and Capturing "OUT OF STOCK" message for Redmi note 5*/
		String outOfStockMessage = "//a[text()='Redmi Note 5 (Gold, 32 GB)']/preceding-sibling::a/div/span";
		System.out.println(driver.findElement(By.xpath(outOfStockMessage)).getText());
		
		/*Close the browser*/
		driver.close();
	}

}
