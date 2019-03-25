package com.vasu.excel;



public class MethodsTest2 

{
//without return type with parameters
	public void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		MethodsTest2 v=new MethodsTest2();
		v.add(20, 30);//calling a method with method name// it won't return any value
		/*
		 * int res=v.add(); //calling a method with variable //it will return a value
		 * 
		 * System.out.println(res);
		 */
		
		
	}
}
