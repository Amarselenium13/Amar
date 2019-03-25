package com.vasu.excel;

public class MethodsTest 

{
//with return type with parameters
	public int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	public static void main(String[] args)
	{
		MethodsTest v=new MethodsTest();
		v.add(20, 30);//calling a method with method name// it won't return any value
		int res=v.add(40, 30); //calling a method with variable //it will return a value
		
		System.out.println(res);
		
		
	}
}
