package com.tns.junittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class JUnitTesting3 
{
	@Test
	void print()
	{
		int a=1;
		int b=1;
		assertEquals(a,b);
	}
	@Disabled
	@Test
	void print1()
	{
		int a=1;
		int b=2;
		assertEquals(a,b);
	}

}
