package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DragMeTextTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		/*
		 * List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		 * System.out.println(frames.size());
		 */
		
		//driver.switchTo().frame(0);

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		
		 String text=driver.findElement(By.xpath("//*[@id=\'draggable\']")).getText();
		 System.out.println(text);
		 
		 driver.switchTo().defaultContent();
		 
		 String heading=driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		 System.out.println(heading);
	}

}
