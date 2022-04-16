package com.tns.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example3 {

	public static void main(String[] args) {
		LinkedHashSet s=new LinkedHashSet();
		s.add(11);
		s.add(null);
		s.add(11);
		System.out.println(s);


	}

}
