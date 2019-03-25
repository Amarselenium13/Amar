package com.vasu.practies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException

	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		String parent = driver.getWindowHandle();// 11111
		// System.out.println(parent);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginsubmit")).click();

		Set<String> windows = driver.getWindowHandles();// 11111&22222
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			//System.out.println(it.next().toString());
			driver.switchTo().window(it.next().toString());
			driver.close();
		}
		/*
		 * for (String child : windows) { //System.out.println(child);//11111&22222
		 * //driver.switchTo().window(child); //System.out.println(driver.getTitle());
		 * //driver.close();
		 * 
		 * driver.switchTo().window(child); if (!driver.getTitle().equals("NetBanking"))
		 * { driver.close(); }
		 * 
		 * 
		 * if (!parent.equals(child)) { driver.switchTo().window(child);
		 * driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click(); }
		 * 
		 * }
		 */

	}

}
