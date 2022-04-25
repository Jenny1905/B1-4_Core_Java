package com.tns.api;
import java.util.*;
import java.util.stream.*;

public class Example1 {

	public static void main(String[] args) {
		
		List<Integer>values=Arrays.asList(11,22,33);
		List<Integer>var=values.stream().map(i->i).collect(Collectors.toList());
		System.out.println(var);

	}

}
