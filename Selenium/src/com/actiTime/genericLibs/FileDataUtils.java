package com.actiTime.genericLibs;
/**
 * 
 * @author Namitha
 *
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileDataUtils {
	
	String propertyFile = "./DataFiles/commonData.properties";
	String testDataFile = "./DataFiles/TestData.xlsx";
	
	public Properties getPropertiesFileObject() throws Throwable
	{
		FileInputStream file = new FileInputStream(propertyFile);
		Properties pObj = new Properties();
		pObj.load(file);
		return pObj;
	}
	
	
	public String getExcelFileData(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream file = new FileInputStream(testDataFile);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(cellNum).getStringCellValue();
		wb.close();
		return data;
	}
	
	public void SetExcelFileData(String sheetName, int rowNum, int cellNum, String data) throws Throwable
	{
		//Open file in read mode and prepare or write the content
		FileInputStream fileRead = new FileInputStream(testDataFile);
		Workbook wb = WorkbookFactory.create(fileRead);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cell =row.createCell(cellNum);
		cell.setCellValue(data);
		
		//Open file in write mode and save the changes made to the file
		FileOutputStream fileWrite = new FileOutputStream(testDataFile);
		wb.write(fileWrite);
		wb.close();
	}
}
