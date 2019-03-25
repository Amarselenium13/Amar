package com.vasu.practies;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderlinksAmazonTest {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement total=driver.findElement(By.id("nav-xshop"));
		
		List<WebElement> links=total.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement element : links)
		{
			System.out.println(element.getText());

		
			/*
			 * System.setProperty("webdriver.gecko.driver",
			 * "C:\\Users\\Pradyun\\Desktop\\13 02 2019\\Drivers 13 02 2019\\geckodriver.exe"
			 * );
			 */
		
		
		
		
		
				}

	}

	
}