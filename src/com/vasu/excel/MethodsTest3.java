package com.vasu.excel;




public class MethodsTest3 

{
//without return type without parameters
	public void add()
	{
		int a=50;
		int b=40;
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		MethodsTest3 v=new MethodsTest3();
		v.add();//calling a method with method name// it won't return any value
		/*
		 * int res=v.add(); //calling a method with variable //it will return a value
		 * 
		 * System.out.println(res);
		 */
		
		
	}
}
