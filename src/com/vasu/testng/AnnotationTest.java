package com.vasu.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest 

{
	@Test
	public void method1()
	{
		System.out.println("Method1 Executed");
	}
	@Test
	public void method2()
	{
		System.out.println("Method2 Executed");
	}
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("BeforeTest Executed"); 
	}
    @AfterTest
    public void afterTest() 
    {
    	System.out.println("AfterTest Executed");
    }
    @BeforeClass
    public void beforeClass()
    {
    System.out.println("BeforeClass Executed");
    }
    @AfterClass
    public void afterClass()
    {
    System.out.println("AfterClass Executed");
    }	
	
	  @BeforeMethod
	  public void beforeMethod()
	  {
	  System.out.println("BeforeMethod Executed");
	  }
	  
	  @AfterMethod
	  public void afterMethod()
	  {
	  System.out.println("AfterMethod Executed"); 
	  }
	 
}


