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
public class ReadExpectedDataFromExcelSheet {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./DataFiles/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet3");
		
		int n = sh.getLastRowNum();
		System.out.println("Number of rows="+n);
		for(int i=1;i<=n;i++)
		{
			Row row = sh.getRow(i);
				String name = row.getCell(1).getStringCellValue();
				
				//System.out.println(row.getCell(4).getStringCellValue());
				if(name.equals("Kushi"))
				{
					/*String d = row.getCell(0).getStringCellValue();
					System.out.println(d);
					
					String d1 = row.getCell(1).getStringCellValue();
					System.out.println(d1);
					
					String d2 = row.getCell(2).getStringCellValue();
					System.out.println(d2);
					
					String d3 = row.getCell(3).getStringCellValue();
					System.out.println(d3);
					
					String d4 = row.getCell(4).getStringCellValue();
					System.out.println(d4);*/
					
					System.out.println("Number of columns="+row.getLastCellNum());
					for(int j=0;j<=row.getLastCellNum()-1;j++)
					{
						String data = row.getCell(j).getStringCellValue();
						System.out.print(data+"\t");
					}
					break;
				}
				
		}
	}

}
