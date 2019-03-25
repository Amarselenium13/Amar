package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

		public class FireFoxBrowserTest

		{

			public static void main(String[] args) 
			
			{
							FirefoxDriver Driver=new FirefoxDriver();
						    Driver.get("Http://newtours.demoaut.com");
							Driver.manage().window().maximize();
							
							Driver.findElement(By.linkText("REGISTER")).click();
							
							System.out.println(Driver.getTitle());
							
							System.out.println(Driver.getCurrentUrl());
							
							//Driver.navigate().back();
							
							//Driver.close();
				
							
						}
				    			
					}


	






