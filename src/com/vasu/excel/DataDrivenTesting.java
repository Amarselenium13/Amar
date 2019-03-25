package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {

	public static void main(String[] args) throws Exception 
	{
		
	PrimusBank app=new PrimusBank();
	app.appLaunch("Http://Primusbank.qedgetech.com");
	app.appLogin("Admin", "Admin");
	//Reading the data from excel0
	File srcFile=new File("E:\\TestData.xlsx");
	FileInputStream fis=new FileInputStream(srcFile);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheet("Sheet1");
	
	//row counts
	int rcnt=ws.getLastRowNum();
	for (int i = 0; i <=rcnt; i++)
	
	{
		String branchName=ws.getRow(i).getCell(0).getStringCellValue();
		String add1=ws.getRow(i).getCell(1).getStringCellValue();
		String countryName=ws.getRow(i).getCell(2).getStringCellValue();
		String results=app.branchCreation(branchName, add1,countryName);
		ws.getRow(i).createCell(3).setCellValue(results);
		FileOutputStream fos=new FileOutputStream(srcFile);
		wb.write(fos);
		
	}
	
	wb.close();
	app.appLogout();
	app.appClose();

	}

}
