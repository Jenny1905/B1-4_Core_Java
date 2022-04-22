package com.tns.junittesting;


import org.junit.jupiter.api.BeforeAll;


import org.junit.jupiter.api.Test;



public class JUnitTesting4 
{
	@BeforeAll
	static void display()
	{
		System.out.println("Dileep");
	}
	
	@Test
	void display1()
	{
		System.out.println("Kamal");
	}
}