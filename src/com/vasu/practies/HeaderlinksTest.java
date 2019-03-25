package com.vasu.practies;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderlinksTest {

	public static void main(String[] args) 
	
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
		WebElement header=driver.findElement(By.className("sw_tb"));
		
		List<WebElement> headerlinks=header.findElements(By.tagName("a"));
		System.out.println(headerlinks.size());
		for (WebElement element : headerlinks)
		{
			System.out.println(element.getText());
		}

	}

	
}
