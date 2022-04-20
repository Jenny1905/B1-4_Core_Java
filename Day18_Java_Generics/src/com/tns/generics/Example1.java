package com.tns.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Shashank");
		a.add("Suresh");
		System.out.println(a);
		//a.add(20);
		//String s=a.get(1);
		//System.out.println(s);
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
