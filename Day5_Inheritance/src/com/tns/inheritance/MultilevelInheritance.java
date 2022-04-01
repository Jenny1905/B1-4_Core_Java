package com.tns.inheritance;

class R6
{
	void print()
	{
		System.out.println("I like R6");
	}
	void print1()
	{
		System.out.println("I drive R6");
	}
}
class R3 extends R6
{
	void display()
	{
		System.out.println("I like R3");
	}
}
class R15 extends R3
{
	void assign()
	{
		System.out.println("I like R15");
	}
}
public class MultilevelInheritance 
{

	public static void main(String[] args) 
	{
		R15 r=new R15();
		r.display();
		r.assign();
		r.print();
		r.print1();

	}

}
