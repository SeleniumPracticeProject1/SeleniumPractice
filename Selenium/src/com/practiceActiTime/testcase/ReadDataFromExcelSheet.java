package com.practiceActiTime.testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Namitha
 *
 */
public class ReadDataFromExcelSheet {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream file =new FileInputStream("E:\\Selenium\\ExcelFile\\Example.xlsx");
		
		//WorkbookFactory work = new WorkbookFactory();
		Workbook wb = WorkbookFactory.create(file);
		/*Sheet sh = wb.getSheet("Sheet1");
		
		
		Row rw = sh.getRow(2);
		
		Cell c1 = rw.getCell(1);
		int customerId = (int) c1.getNumericCellValue();
		
		Cell c2 = rw.getCell(2);
		String customerName = c2.getStringCellValue();
		
		
		
		Row rw2 = sh.getRow(4);
		
		Cell c3 = rw2.getCell(1);
		double projectId = c3.getNumericCellValue();
		
		Cell c4 = rw2.getCell(2);
		String projectName = c4.getStringCellValue();*/
		
		int customerId = (int) wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		String customerName = wb.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		int projectId = (int) wb.getSheet("Sheet1").getRow(4).getCell(1).getNumericCellValue();
		String projectName = wb.getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
				

		
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(projectId);
		System.out.println(projectName);
	}

}
