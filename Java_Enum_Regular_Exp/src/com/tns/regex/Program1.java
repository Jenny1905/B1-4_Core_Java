package com.tns.regex;

import java.util.regex.Pattern;

public class Program1 {
public static void main(String[] args) {
	/*matches (pattern, inputSequence ) : This method returns true only if 
	//the entire input text matches the pattern. This method internally depends on the 
	//compile() and matcher() methods of the Pattern object. Note that matches() is a 
	static method.*/
String inputStr = "Shiwani";
String pattern = "Shiwani";
boolean patternMatched = Pattern.matches(pattern, inputStr); 
System.out.println(patternMatched);
}
}

