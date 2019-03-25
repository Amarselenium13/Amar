package com.amar.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTest {

	public static void main(String[] args) throws InterruptedException 
	
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
		
			System.out.println(links.get(i).getText());
			
			  if(links.get(i).getText().isEmpty())
			  
			  { System.out.println(links.get(i).getText());
			  
			  }
			 
		    
			if(links.get(i).getText().equals("Images"))
			{
				links.get(i).click();
			}
		
		}

	}

}
