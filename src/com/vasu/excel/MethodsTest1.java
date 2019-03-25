package com.vasu.excel;


public class MethodsTest1 

{
//with return type without parameters
	public int add()
	{
		int a=40;
		int b=50;
		int sum=a+b;
		return sum;
	}
	
	public static void main(String[] args)
	{
		MethodsTest1 v=new MethodsTest1();
		//v.add(20, 30);//calling a method with method name// it won't return any value
		int res=v.add(); //calling a method with variable //it will return a value
		
		System.out.println(res);
		
		
	}
}
