package com.tns.goshoppingapp.framework;



// Defining the abstract sub class NormalAcc of super abstract class ShopAcc 
public abstract class NormalAcc extends ShopAcc {
	

	private static float deliveryCharges; // Defining the static private class variable

	// NormalAcc class constructor to initialize the values
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges ) 
	{
		super(accNo, accNm, charges);
		NormalAcc.deliveryCharges = deliveryCharges;
	}

    // Defining the getter method to read private static variable deliveryCharges
	public static float getDeliveryCharges()
	{
		return deliveryCharges;
	}
	


	@Override
	public String toString() {
		return "NormalAcc [getCharges()=" + getCharges()+"getdeliveryCharges"+ getDeliveryCharges() + ", toString()=" + super.toString() + "]";
	}

	
	// Overriding the toString method to print the object
	
 
	

}
