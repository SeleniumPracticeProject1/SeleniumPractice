package com.practiceActiTime.testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha
 *
 */
public class CpatureAllLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIgIvp7oON2wIVWBWPCh388QXyEAAYASAAEgL7C_D_BwE&semcmpid=sem_8024046704_brand_eta_goog&s_kwcid=AL!739!3!265058422074!p!!g!!flipkart&ef_id=WtrgLAAAAFUZvH-z:20180517151056:s");
		
		/*Capture and display the no of links*/
		List<WebElement> lList = driver.findElements(By.xpath("//a"));
		//List<WebElement> lList = driver.findElements(By.tagName("a"));
		System.out.println("No of links="+lList.size());
		/*for(int i=0;i<lList.size();i++)
		{
			//System.out.println(lList.get(i).getText());
			
		}*/
		
		/*Capture and display the no of buttons*/
		List<WebElement> bList = driver.findElements(By.xpath("//input[@type='button' or @type='submit']"));
		System.out.println("No of buttons="+bList.size());
		
		List<WebElement> tList = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("No of textbox="+tList.size());
		driver.close();
	}

}
