package com.vasu.practies;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest 

{

		
	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Pradyun\\Desktop\\13 02 2019\\Drivers 13 02 2019\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		
		
		

	}

	
	
}
