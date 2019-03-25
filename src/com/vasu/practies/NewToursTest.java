package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursTest {

	public static void main(String[] args) 
	
	{
		FirefoxDriver driver=new FirefoxDriver(); 
		
	
		
	    driver.get("http://newtours.demoaut.com");
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		driver.close();
		
		
		

	}

}
