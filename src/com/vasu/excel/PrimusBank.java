package com.vasu.excel;

import java.io.FileOutputStream;

import org.apache.commons.collections4.map.StaticBucketMap;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank 

{
	FirefoxDriver driver;
String res;
	//appLaunch
	public String appLaunch(String url)
	{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//validate
		if(driver.findElement(By.id("txtuId")).isDisplayed())
{
	
	res="Pass";
}else
{
	
	res="Fail";
}
	
	return res;
	}
		//appLogin
	    public String appLogin(String userName, String password)
	    {
	    	driver.findElement(By.id("txtuId")).sendKeys(userName);
			driver.findElement(By.id("txtPword")).sendKeys(password);
			driver.findElement(By.id("login")).click();
			//validation
			if(driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
			{
				
				res="Pass";
			}else
			{
				
				res="Fail";
			}
				
				return res;

	    }
	    //branchCreation
	    public String branchCreation(String branchName,String add1,String countryName) throws Exception
	    {
	    	Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.id("BtnNewBR")).click();
			driver.findElement(By.id("txtbName")).sendKeys(branchName);
			driver.findElement(By.id("txtAdd1")).sendKeys("add1");
			driver.findElement(By.id("txtZip")).sendKeys("44444");
			
			Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
			country.selectByVisibleText("INDIA");
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
				res="Pass";
				
			}else if(msg.contains("already Exist"))
			
			{
				res="Fail";
			}else if(msg.contains("please fill in"))
			
			{
				res="Warning";
			}
			
			driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
			return res;
	    }
	    //applogout
	    public String appLogout() throws Exception
	    {
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\'Table_02\']/tbody/tr/td[3]/a/img")).click();
	    	//validate
			if(driver.findElement(By.id("txtuId")).isDisplayed())
	{
		
		res="Pass";
	}else
	{
		
		res="Fail";
	}
		
		return res;
	    	
	    }
		//appClose
	    public void appClose()
	    {
	    	driver.close();
	    }
	    public static void main(String[] args) throws Exception
		
		{
		
		  /*PrimusBank app=new PrimusBank();
		  app.appLaunch("Http://Primusbank.qedgetech.com");
		  app.appLogin("Admin","Admin");
		  app.branchCreation("Amar3456","Ameerpet");
		  app.appLogout();
		  app.appClose();*/
		 
	    	
	    PrimusBank app=new PrimusBank();	
	    //appLaunch
	    app.appLaunch("Http://Primusbank.qedgetech.com");
	    app.appClose();
	    //appLogin
	    app.appLaunch("Http://Primusbank.qedgetech.com");
	    app.appLogin("Admin","Admin");
	    app.appLogout();
	    app.appClose();
	    //brannchCreation
	    app.appLaunch("Http://Primusbank.qedgetech.com");
		app.appLogin("Admin","Admin");
		//app.branchCreation("Amar3456","Ameerpet");
		app.appLogout();
		app.appClose();
		
		}
			
	}
	

