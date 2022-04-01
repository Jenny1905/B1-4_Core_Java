package com.tns.inheritance;
class CellPhones
{
	void message()
	{
		System.out.println("Hi, Nikitha");
	}
	void call()
	{
		System.out.println("I am calling Shashank");
	}
}
class SamsungGalaxyM31 extends CellPhones
{
	void facelock()
	{
		System.out.println("Modern Facelock");
	}
}
class OnePlus extends CellPhones
{
	void games()
	{
		System.out.println("PUB-G");
	}
}
public class HierchicalInheritance 
{

	public static void main(String[] args)
	{
		OnePlus o=new OnePlus();
		o.games();
		o.message();
		o.call();
		SamsungGalaxyM31 m=new SamsungGalaxyM31();
		m.facelock();


	}

}
