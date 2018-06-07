package com.actiTime.customerTest;
/**
 * 
 * @author Namitha
 *
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.genericLibs.BaseClass;


@Listeners(com.actiTime.genericLibs.SampleListener.class)
public class CutomerTest extends BaseClass{
	//WebDriver driver;
	
	/*@BeforeClass
	public void configBeforeClass()
	{
		Launch the Firefox browser
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://desktop-o4l6frn/login.do");
	}
	
	@BeforeMethod
	public void configLogin()
	{
		Login to ActiTime application

		
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	}*/
	
	
	
	@Test
	public void createCustomerTest()
	{
		/*Navigate Tasks-->Project & Customer, and then create Customer*/
		
		driver.findElement(By.linkText("Tasks")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("ICICI Bank");
		driver.findElement(By.name("createCustomerSubmit")).click();
		
		/*Verify Create Customer successful message*/
		String actualMsg = driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
		if(actualMsg.contains("has been successfully created."))
			System.out.println("Customer Created Successfully == PASS");
		else
			System.out.println("Customer not created == FAIL");
	}
	
	@Test
	public void modifyCustomerTest()
	{
	
		/*Navigate Tasks-->Project & Customer, and then create Customer*/
		
		
		driver.findElement(By.linkText("Tasks")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("Vijaya");
		driver.findElement(By.name("createCustomerSubmit")).click();
		
		/*Modify the created customer*/
		WebElement selectEle = driver.findElement(By.name("selectedCustomer"));
		Select sel = new Select(selectEle);
		sel.selectByVisibleText("Vijaya");
		
		String show = "//table[@class='mainContentPadding rightPadding']/tbody/tr/td/table/tbody/tr[2]/descendant::input[@type='button']";
		driver.findElement(By.xpath(show)).click();
		
		String selectCustomer = "//table[@class='active_customers_projects listTable']/tbody/tr[2]/td[1]/descendant::a[1]";
		driver.findElement(By.xpath(selectCustomer)).click();
		
		driver.findElement(By.name("name")).sendKeys(" Bank");
		driver.findElement(By.name("saveChanges")).click();
		
		
		/*Verify the Customer Modification Message*/
		String actualMsg = driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
		if(actualMsg.equals("Your changes have been saved."))
			System.out.println("Customer modified successfully == PASS");
		else
			System.out.println("Customer is not modified == FAIL");
	}
	
	@Test
	public void deleteCustomerTest()
	{
		/*Navigate Tasks-->Project & Customer, and then create Customer*/
		
		driver.findElement(By.linkText("Tasks")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("Baroda");
		driver.findElement(By.name("createCustomerSubmit")).click();
		
		/*Select the created customer and delete the selected customer*/
		String selectCheckbox = "//a[text()='Baroda']/../../../../../following-sibling::td/input";
		driver.findElement(By.xpath(selectCheckbox)).click();
		
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		driver.findElement(By.id("deleteButton")).click();
		
		/*Verify whether customer is deleted*/
		String expectedMsg="Selected customers have been successfully deleted.";
		String actualMsg = driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
		if(actualMsg.equals(expectedMsg))
			System.out.println("Customer deleted successfully == PASS");
		else
			System.out.println("Customer not deleted == FAIL");
		
	}
	
	
	
	/*@AfterMethod 
	public void configLogout()
	{
		Logout of ActiTime application
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	@AfterClass
	public void configAfterClass()
	{
		Close the Firefox browser
		
		driver.close();
	}*/
}
