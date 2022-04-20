package com.tns.generics;

public class GenericClass<T>
{
	T val;
	public void print()
	{
		System.out.println(val.getClass().getName());
	}

	public static void main(String[] args) {
		
		GenericClass<Character>obj=new GenericClass<>();
		obj.val='z';
		obj.print();
		
	}

}
