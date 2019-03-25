package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreation_Excel {

	public static void main(String[] args) throws Exception 
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://primusBank.qedgetech.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		//reading the data
File srcFile=new File("E:\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		//
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//row counts
		int rcnt=ws.getLastRowNum();
		for (int i = 1; i <=rcnt; i++)
		
		{
			String branchName=ws.getRow(i).getCell(0).getStringCellValue();
			String add1=ws.getRow(i).getCell(1).getStringCellValue();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.id("BtnNewBR")).click();
			driver.findElement(By.id("txtbName")).sendKeys(branchName);
			driver.findElement(By.id("txtAdd1")).sendKeys("add1");
			driver.findElement(By.id("txtZip")).sendKeys("44444");
			
			Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
			country.selectByIndex(1);
			Thread.sleep(3000);
			Select state=new Select(driver.findElement(By.id("lst_stateI")));
			state.selectByIndex(1);
			Thread.sleep(3000);
			Select city=new Select(driver.findElement(By.id("lst_cityI")));
			city.selectByIndex(1);
			Thread.sleep(3000);
			driver.findElement(By.id("btn_insert")).click();
			Thread.sleep(3000);
			Alert alt=driver.switchTo().alert();
		    Thread.sleep(3000);
			String msg=alt.getText();
			alt.accept();
			
			//validation
			if (msg.contains("created Successfully"))
			
			{
				//System.out.println("BranchCreation Successfully");
				ws.getRow(i).createCell(2).setCellValue("Pass");
				
			}else if(msg.contains("already Exist"))
			
			{
				//System.out.println("BranchCreation Failed");
				ws.getRow(i).createCell(2).setCellValue("Fail");
			}else if(msg.contains("please fill in"))
			
			{
				//System.out.println("Warning Message");
				ws.getRow(i).createCell(2).setCellValue("Warning");
			}
			
			driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
			FileOutputStream fos=new FileOutputStream(srcFile);
			wb.write(fos);
			
		}

		wb.close();
		
		driver.findElement(By.xpath("//*[@id=\'Table_02\']/tbody/tr/td[3]/a/img")).click();
		driver.close();
		
		
		
	}

}
