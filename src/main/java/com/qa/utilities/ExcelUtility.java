package com.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	
	public static XSSFWorkbook excelWbook;
	public static XSSFSheet excelWsheet;
	
	
	
	public static String getCellData(int rowNum,int colNum,String ExcelPath,int SheetNum) throws IOException
	
	{
		FileInputStream Excel=new FileInputStream(ExcelPath);
		excelWbook=new XSSFWorkbook(Excel);
		excelWsheet=excelWbook.getSheetAt(SheetNum);
		
		return
				excelWsheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
	
	
}
	
	public static String getIntegerData(int rowNum,int colNum,String ExcelPath,int SheetNum) throws IOException
	{
		FileInputStream Excel=new FileInputStream(ExcelPath);
		excelWbook=new XSSFWorkbook(Excel);
		excelWsheet=excelWbook.getSheetAt(SheetNum);
		return
				excelWsheet.getRow(rowNum).getCell(colNum).getRawValue();
		
		
	}
	
	
}
