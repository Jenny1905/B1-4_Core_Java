package com.tns.goshoppingapp.applicatiom;

import com.tns.goshoppingapp.framework.NormalAcc;
import com.tns.goshoppingapp.framework.PrimeAcc;
import com.tns.goshoppingapp.framework.ShopFactory;

// Defining a class GSShopFactory to implement the Abstract class ShopFactory
public class GSShopFactory extends ShopFactory {
	
  
	// Overriding the getNewPrimeAcc abstract method to provide body
	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}

	// Overriding the getNewNormalAcc abstract method to provide body
	@Override
	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
