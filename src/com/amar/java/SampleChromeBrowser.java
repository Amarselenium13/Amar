package com.amar.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class SampleChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				
		"C:\\Users\\Pradyun\\Desktop\\13 02 2019\\Drivers 13 02 2019\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("http://.facebook.com");
		
		
		
	}

}
