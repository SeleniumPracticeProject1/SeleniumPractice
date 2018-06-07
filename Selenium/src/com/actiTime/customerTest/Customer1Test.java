package com.actiTime.customerTest;
/**
 * 
 * @author Namitha
 *
 */

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.genericLibs.BaseClass;
import com.actiTime.genericLibs.FileDataUtils;
import com.actiTime.objectRepository.CreateNewCustomer;
import com.actiTime.objectRepository.Home;
import com.actiTime.objectRepository.ProjectAndCustomer;
import com.actiTime.objectRepository.Tasks;

@Listeners(com.actiTime.genericLibs.SampleListener.class)
public class Customer1Test extends BaseClass{

	FileDataUtils lib = new FileDataUtils();
	@Test
	public void createCustomerTest() throws Throwable
	{
		//Getting customer name from excel file
		String customerName = lib.getExcelFileData("Sheet1", 2, 2);
		
		String expCustVerifyMsg = "has been successfully created";
		
		
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.naviateToTask();
		
		Tasks tp = PageFactory.initElements(driver, Tasks.class);
		tp.navigateToProjectAndCustomer();
		
		ProjectAndCustomer pcp = PageFactory.initElements(driver, ProjectAndCustomer.class);
		pcp.createNewCustomer();
		
		CreateNewCustomer cnp = PageFactory.initElements(driver, CreateNewCustomer.class);
		cnp.createCutomer(customerName);
		
		Boolean status = pcp.getActCustVerifyMsg().getText().contains(expCustVerifyMsg);
		Assert.assertTrue(status);
	}
}
