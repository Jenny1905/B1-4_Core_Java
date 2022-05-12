package com.tns.goshoppingapp.framework;

// Defining the abstract class ShopAcc
public abstract class ShopAcc {
	
	// Declaring the private class variable 
	private static int accNo;
	private static String accNm;
	private static float charges;
	
	// Defining the abstract class constructor
	public ShopAcc(int accNo, String accNm, float charges)
	{
		ShopAcc.accNo = accNo;
		ShopAcc.accNm = accNm;
		ShopAcc.charges = charges;
	}
	


	// Declaring the bookProduct abstract method
	public abstract void bookProduct(float charges);
	
	// Declaring the items abstract method
	public abstract void items(float charges);
     

	// Defining the static getter method to read the private AccNo class variable
	public static int getAccNo() {
		return accNo;
	}
	
	
	// Defining the static getter method to read the private charge class variable
	public static float getCharge() {
		return charges;
	}
	

	// Defining the static getter method to read the private AccNo class variable
	public static String getAccNm() {
		return accNm;
	}

	// Defining the static setter method to write the private accNm class variable
	public static void setAccNm(String accNm1) {
		accNm = accNm1;
	}

	// Defining the static getter method to read the private charges class variable
	public float getCharges() {
		return charges;
	}


	// Overriding  the toString method to print the object.
	public String toString()
	{
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
		

}
