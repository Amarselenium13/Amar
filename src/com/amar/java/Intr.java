package com.amar.java;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Intr {

	public static void main(String[] args) {
		
	

		System.setProperty("webdriver.ie.driver", 
				
		"C:\\Users\\Pradyun\\Desktop\\13 02 2019\\Drivers 13 02 2019\\MicrosoftWebDriver.exe");
		new InternetExplorerDriver();
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		
		driver.get("http://facebook.com");
		
		
	}

}
