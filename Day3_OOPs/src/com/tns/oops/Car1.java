package com.tns.oops;

public class Car1 
{
	String str;
	Car1(String s)
	{
		str=s;
	}
	void print()
	{
		System.out.println("This is "+str);
	}

	public static void main(String[] args) 
	{
		Car1 a=new Car1("Audi");
		Car1 c=new Car1("Mercedes-Benz");
		Car1 c1=new Car1("BMW");
		a.print();
		c.print();
		c1.print();
	}

}
