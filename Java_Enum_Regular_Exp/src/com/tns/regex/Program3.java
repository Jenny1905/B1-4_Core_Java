package com.tns.regex;

//Java program Illustrating Working of split() Method
import java.util.regex.Pattern;
class Program3 {

	
	public static void main(String args[])
	{

		// Custom string
		String text = "AL1ZAM3ZAM";

		// Specifies the string pattern
		// which is to be searched
		String delimiter = "\\d";
		Pattern pattern = Pattern.compile(
			delimiter, Pattern.CASE_INSENSITIVE);

		
		String[] result = pattern.split(text);

		
		for (String temp : result)
			System.out.println(temp);
	}
}
