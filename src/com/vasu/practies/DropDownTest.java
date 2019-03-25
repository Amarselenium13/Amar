package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest {

	public static void main(String[] args) 
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://Amazon.in");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement>dropList=drop.findElements(By.tagName("option"));
		System.out.println(dropList.size());
		for (WebElement element : dropList) 
		{
			//element.click(); 
			
			/*
			 * //System.out.println(element.getText()); if
			 * (element.getText().equals("Baby")) { element.click();
			 * 
			 * 
			 * }
			 */
	
		element.click();
		//validation
		if (element.isSelected()) 
		
		{
		System.out.println(element.getText()+" : is selected");
		
		}else
		{
			System.out.println(element.getText()+" : is not selected");	
		}
			
		
		}

	}
}
