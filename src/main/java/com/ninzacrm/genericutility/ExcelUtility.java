package com.ninzacrm.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public  String toGetDataFromExcel(String SheetName,int r,int c) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis= new FileInputStream("./src/main/resources/ninzacrm1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet(SheetName);
		
		Row row = sh.getRow(0);
		
		Cell cell = row.getCell(1);
		
		String value = cell.getStringCellValue();
		return value;
			
		
	}

}
