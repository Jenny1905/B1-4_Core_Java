package com.tns.abst;

class Example11
{
	final void display()
	{
		System.out.println("Hello Students");
	}
}
public class Example2 extends Example11
{
	 
	
	void eat()
	{
		
		System.out.println("Welcome to C2TC");
	}

	public static void main(String[] args) 
	{
		Example2 e=new Example2();
		e.display();

	}

}
