package com.tns.polymorphism;

public class OverLoading 
{
	void assign(int a,int b)
	{
		System.out.println("Area of Rectangle: "+(a*b) );
	}
	void assign(float a,float b)
	{
		System.out.println("Area of Rectangle: "+(float)(a*b) );
	}
	
	

	public static void main(String[] args) {
		OverLoading o=new OverLoading();
		o.assign(5,10);
		o.assign(10f, 20f);

	}

}
