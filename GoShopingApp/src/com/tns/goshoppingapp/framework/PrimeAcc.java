package com.tns.goshoppingapp.framework;


// Defining the abstract sub class PrimeAcc of super abstract class ShopAcc
public abstract class PrimeAcc extends ShopAcc {
	
	private static boolean isPrime; // Declaring the private static boolean class variable isPrime
	private static final float deliveryCharges = 0.0f; // Defining the private static delivery Charge class variable 
	  
	// Defining the public constructor of abstract class PrimeAcc
	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime)
	{
		super(accNo, accNm, charges);
		PrimeAcc.isPrime = isPrime;
	}
	
	
	// Defining the static getter method to read the private static boolean class variable isPrime
	public static boolean getisPrime() {
		return isPrime;
	}

	// Defining the static getter method to read the private static variable deliveryCharges
	public static float getDeliveryCharges() 
	{
		return deliveryCharges;
	}
	
		
	
}
