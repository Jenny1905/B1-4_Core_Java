package com.tns.oops;

public class Nonparameterized
{

	

	String str;
	int a;
	Nonparameterized()
	{
		str="Soujan";
		a=11;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonparameterized c=new Nonparameterized();
		c.display();
	}

}