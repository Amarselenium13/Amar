package com.vasu.practies;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTest 

{

	
	public static void main(String[] args) 
	
	{
	
		System.setProperty("webdriver.ie.driver", 
		"C:\\Users\\Pradyun\\Desktop\\13 02 2019\\Drivers 13 02 2019\\MicrosoftWebDriver.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://gmail.com");
		
		

	}

}
