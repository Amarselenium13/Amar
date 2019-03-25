package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest 
{

	public static void main(String[] args) 
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://Amazon.in");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select sl=new Select(drop);
		//sl.selectByIndex(7);
		//sl.selectByVisibleText("Baby");
		//sl.selectByValue("search-alias=electronics");
		//List<WebElement> dropList=sl.getOptions();
		//System.out.println(dropList.size());
		System.out.println(sl.isMultiple());

	}

}
