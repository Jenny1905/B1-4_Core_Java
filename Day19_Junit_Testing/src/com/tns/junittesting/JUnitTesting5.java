package com.tns.junittesting;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnitTesting5
{
	@Test
	void accept()
	{
		System.setProperty("1", "Shashank");
		Assumptions.assumeFalse("Shashank".equals(System.getProperty("2")));
		
	}

}
