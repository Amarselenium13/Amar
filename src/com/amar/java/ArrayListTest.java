package com.amar.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) 
	
	{
		List<String>l=new ArrayList<>();
		l.add("Selenium");
		l.add("Vasu");
		l.add("Amar");
		l.add("UFT");
		l.add("Vasu");
		System.out.println(l.size());
		/*
		   for (int i = 0; i < l.size(); i++)
		   
		   {
		   
		   System.out.println(l.get(i)); }
		 */
	    for(String list:l)
	    {
	    	System.out.println(list);
	    }
		
		
	}

}
