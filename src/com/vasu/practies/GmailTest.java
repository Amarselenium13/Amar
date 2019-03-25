package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException 
	
	{
		//String expTitle="Gmail";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://google.co.in");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("SIGN IN")).click();
		//String actTitle=driver.getTitle();
		//Validation
		/*
		 * if(expTitle.equals(actTitle)) { System.out.println("Link working"); }else {
		 * System.out.println("Link not working"); }
		 */
		
		Thread.sleep(3000);
		if(driver.findElement(By.id("identifierId")).isDisplayed())

{
	System.out.println("pass");
	
}else
{
	System.out.println("Fail");
}


		
	}

}
