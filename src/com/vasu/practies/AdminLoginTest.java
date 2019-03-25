package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginTest {

	public static void main(String[] args) 
	
	{
	    String userName="Admin";
	    String password="Admin";
	    
				System.setProperty("webdriver.chrome.driver", 
				
				"C:\\Users\\Pradyun\\Desktop\\13 02 2019\\Drivers 13 02 2019\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				
				
				driver.get("http://primusbank.qedgetech.com");
				driver.manage().window().maximize();
				
				driver.findElement(By.id("txtuId")).sendKeys(userName);
				driver.findElement(By.id("txtPword")).sendKeys(password);
				driver.findElement(By.id("login")).sendKeys(Keys.ENTER);

	}

}
