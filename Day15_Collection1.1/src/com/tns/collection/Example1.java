package com.tns.collection;

import java.util.ArrayList;

public class Example1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList<>(2);
		obj.add(10.0);
		obj.add("Shiv");
		obj.add(5);
		obj.add('c');
		System.out.println(obj);

	}

}
