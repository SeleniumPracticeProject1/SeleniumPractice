package com.practiceActiTime.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 * @author Namitha
 *
 */
public class DragDropDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
			
		WebElement srcE = driver.findElement(By.id("draggable"));
		
		WebElement dstE = driver.findElement(By.id("droptarget"));
		
		Actions act = new Actions(driver);
		
		/*act.dragAndDrop(srcE, dstE).perform();
		
		String actualmsg = driver.findElement(By.id("droptarget")).getText();
		
		if(actualmsg.equals("You did great!"))
		{
			System.out.println(actualmsg);
			System.out.println("PASS");
		}
		else
			System.out.println("FAIL");*/
		
/*=========================OR===============================*/
		act.clickAndHold(srcE).perform();
		act.moveToElement(dstE).perform();
		act.release().perform();
		
		driver.close();
	}

}
