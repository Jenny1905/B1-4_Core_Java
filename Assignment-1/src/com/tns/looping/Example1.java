package com.tns.looping;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//10
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			s.close();
		}

	}

}
