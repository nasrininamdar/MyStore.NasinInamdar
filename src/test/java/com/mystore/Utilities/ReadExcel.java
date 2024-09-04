package com.mystore.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	public static String getData(String filename, String sheetname,  int rowNo, int celNo) throws IOException {
		
		FileInputStream file= new FileInputStream(filename);
		Sheet sh = WorkbookFactory.create(file).getSheet(sheetname);
		String value = sh.getRow(rowNo).getCell(celNo).getStringCellValue();
		return value;
		
	}
	
	
}
