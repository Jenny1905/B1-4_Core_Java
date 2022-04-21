package com.tns.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Program2 {

	
	public static void main(String args[])
	{

		// Create a pattern to be searched
		// Custom pattern
		Pattern pattern = Pattern.compile("I");

		// Search above pattern in "I lives in Mumbai and I love it"
		Matcher m = pattern.matcher("I lives in Mumbai and I love it");

		// Finding string using find() method
		while (m.find())

			// Print starting and ending indexes
			// of the pattern in the text
			// using this functionality of this class
			System.out.println("Pattern found from "
							+ m.start() + " to "
							+ (m.end() - 1));
	}
}
