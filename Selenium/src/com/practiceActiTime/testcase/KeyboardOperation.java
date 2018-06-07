package com.practiceActiTime.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 * @author Namitha
 *
 */
public class KeyboardOperation {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		/*driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();*/
		
		driver.get("https://gmail.com");
		
		/*WebElement web =  driver.findElement(By.name("username"));
		web.sendKeys("admin");
		
		Actions act = new Actions(driver);
		
		act.doubleClick(web).perform();
		
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
		
		act.doubleClick(web)
			.sendKeys(Keys.chord(Keys.CONTROL,"c"))
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.chord(Keys.CONTROL,"v"))
			.build().perform();
		
		Thread.sleep(3000);

		driver.close();*/
	}
}
