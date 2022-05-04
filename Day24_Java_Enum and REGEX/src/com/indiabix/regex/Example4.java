package com.indiabix.regex;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str="Batch 1-4 CG1.1 \r\n Soujan \r\n Hrithik";
		
		
		String[] res=str.split("\\r?\\n");
		
		for(String i:res)
		{
			System.out.println(i);
		}
		
		

	}

}
