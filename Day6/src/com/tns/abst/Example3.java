package com.tns.abst;

class A
{
	String name="Soujan";
}
class B extends A
{
	String name="Nikitha";
	void print()
	{
		System.out.println("Hi, I am "+name);
		System.out.println("Hi, I am "+super.name);
	}
}
public class Example3 
{

	public static void main(String[] args) 
	{
		B b=new B();
		b.print();

	}

}
