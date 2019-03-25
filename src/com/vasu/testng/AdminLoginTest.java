package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AdminLoginTest 
{
	ChromeDriver driver;
	@Test(priority=1)
	public void appLaunch()
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Pradyun\\Desktop\\13 02 2019\\Drivers 13 02 2019\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.findElement(By.id("txtuId")).isDisplayed());
	}
	@Test(priority=2)
	public void appLogin()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
		
	}
	@Test(priority=3)
	public void appClose()
	{
		driver.close();
	}
}
