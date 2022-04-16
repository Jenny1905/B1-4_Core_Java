package com.tns.collection;

import java.util.ArrayDeque;

public class Example2 {

	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.add(11);
		a.add("Hello");
		System.out.println(a);
		a.addFirst(12);
		a.addLast("World");
		System.out.println(a);

	}

}
