package com.practiceActiTime.testcase;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 * @author Namitha
 *
 */
public class MultipleWindowHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriverServer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Tourism"))).perform();
		
		act.moveToElement(driver.findElement(By.linkText("Stays"))).perform();
		
		act.click(driver.findElement(By.linkText("Retiring Room"))).perform();

		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		String parentId = it.next();
		String childId = it.next();

		
		System.out.println("Child Window Information");
		
		driver.switchTo().window(childId);
		String childTitle = driver.getTitle();
		String childUrl = driver.getCurrentUrl();
		System.out.println("Child Window ID==>"+childId);
		System.out.println("Child Window Title==>"+childTitle);
		System.out.println("Child Window url==>"+childUrl);
		driver.close();
		
		System.out.println("Child Window closed");
		System.out.println();
		System.out.println("========================================================================");
		System.out.println();
		System.out.println("Parent Window Information");
		
		driver.switchTo().window(parentId);
		String parentTitle = driver.getTitle();
		String parentUrl = driver.getCurrentUrl();
		System.out.println("Parent Window ID==>"+parentId);
		System.out.println("Parent Window Title==>"+parentTitle);
		System.out.println("Parent Window url==>"+parentUrl);
		
		driver.close();
	}

}
