package com.tns.polymorphism;

public class OverLoading1 
{
	void assign(float a,float b)
	{
		System.out.println("Area of Rectangle: "+(float)(a*b) );
	}
	void assign(int a,int b)
	{
		System.out.println("Area of Rectangle: "+(a*b) );
	}
	
	

	public static void main(String[] args) {
		OverLoading o=new OverLoading();
		o.assign(5f,10f);
		o.assign(10, 20);

	}

}



