package com.tns.inheritance;

class Parent
{
	void print()
	{
		System.out.println("Hello,This is Shiwani");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Single Inheritance");
	}
}
class SingleInheritance
{

	public static void main(String[] args)
	{
		Child c=new Child();
		c.display();
		c.print();

	}

}
