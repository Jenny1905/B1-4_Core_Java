package com.tns.collection;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<Integer>obj=new ArrayList<Integer>(2);
		obj.add(10);
		obj.add(20);
		obj.add(10);
		obj.add(40);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains(15));
		System.out.println(obj.indexOf(10));
		System.out.println(obj.lastIndexOf(10));
		System.out.println(obj.get(3));
		obj.set(3,101);
		System.out.println(obj);
		
		System.out.println(obj.isEmpty());
	}

}
