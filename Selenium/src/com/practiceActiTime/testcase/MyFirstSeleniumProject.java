package com.practiceActiTime.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumProject {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Java");
		WebDriver driver = new FirefoxDriver();
		
		Dimension dim = new Dimension(500, 550);
		driver.manage().window().setSize(dim);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		/*String title = driver.getTitle();
		System.out.println("Title of the Gmail Application = "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Url of the Gmail application = "+url);
		
		String sourceCode = driver.getPageSource();
		System.out.println("Source Code of Gmail Application");
		System.out.println(sourceCode);*/
		
		driver.findElement(By.xpath("//span[text()='Forgot email?']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
	
		Thread.sleep(3000);
		
		/*driver.findElement(By.xpath("//span[text()='Create account']")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.navigate().back();*/
		
		
		
		
		driver.findElement(By.id("identifierId")).sendKeys("namitha029");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("nihal@!*");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("gb_db gbii")).click();
		
		driver.close();
	}

}
