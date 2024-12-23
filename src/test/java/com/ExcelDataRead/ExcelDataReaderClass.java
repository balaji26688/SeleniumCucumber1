package com.ExcelDataRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReaderClass {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\91898\\OneDrive\\Desktop\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);

		try (Workbook workbook = new XSSFWorkbook(fis)) {
			Sheet sheet = workbook.getSheetAt(0);

			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("===========This is sheet-1 data=============");
			for (int i = 1; i < rowcount; i++) {
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(0);
				String cellvalue = cell.getStringCellValue();
				System.out.println(cellvalue + "-" + i);
			}
			System.out.println("===========This is sheet-2 data==============");

			Sheet sheet2=workbook.getSheet("Sheet2");
			int row2=sheet2.getPhysicalNumberOfRows();
			for(int i=0;i<row2;i++)
			{
				Row row3=sheet2.getRow(i);
				Cell cell2=row3.getCell(0);
				String str=cell2.getStringCellValue();
				System.out.println(str);
			}
			
			System.out.println("===========This is sheet-2 second column data=============");

			Sheet sheet3=workbook.getSheet("Sheet2");
			int row3=sheet3.getPhysicalNumberOfRows();
			for(int i=0;i<row3;i++)
			{
				Row row4=sheet3.getRow(i);
				Cell cell3=row4.getCell(1);
				String str1=cell3.getStringCellValue();
				System.out.println(str1);
			}
		}
	}

}
