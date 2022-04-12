package com.tns.exception;

public class Example4 
{
	static void display(int age,int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("You are eligible to donate the blood");
		}
		else
		{
			throw new ArithmeticException("Not eligible");
		}
	}

	public static void main(String[] args)
	{
		display(16,55);
		System.out.println("Exception handled");
		

	}

}
