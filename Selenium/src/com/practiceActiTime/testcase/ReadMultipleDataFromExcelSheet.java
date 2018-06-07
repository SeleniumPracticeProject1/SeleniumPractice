package com.practiceActiTime.testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Namitha
 *
 */
public class ReadMultipleDataFromExcelSheet {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream(".\\TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet2");
		
		int lastRowIndex = sh.getLastRowNum();
		for(int i=1;i<=lastRowIndex;i++)
		{
			Row row = sh.getRow(i);
				System.out.println(row.getCell(0)+"\t"+row.getCell(1));
			
		}
	}

}
