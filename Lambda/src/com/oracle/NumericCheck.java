package com.oracle;

public class NumericCheck 
{
	public static void main(String args[])
	{
		NumericTest isEven = (n) -> (n % 2)==0;
		
		if(isEven.test(10)) 
			System.out.println("10 is even");
		
	}
}
