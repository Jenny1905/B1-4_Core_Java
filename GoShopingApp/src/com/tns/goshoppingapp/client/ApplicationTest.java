package com.tns.goshoppingapp.client;

import com.tns.goshoppingapp.applicatiom.*;
import com.tns.goshoppingapp.framework.*;


public class ApplicationTest {

	public static void main(String[] args) {
		
		// Defining the GSShopFactory to the reference of abstract class ShopFactory
		@SuppressWarnings("unused")
		ShopFactory shopObj = new GSShopFactory();
		
		// Instantiate GSPrimeAcc and refer it through reference PrimeAcc.
		PrimeAcc primeAccObj = new GSPrimeAcc(1234, "Siddhnat_1", 0.0f, true);
		
        // Instantiate GSNormalAcc and refer it through reference NormalAcc.
		NormalAcc normalAccObj = new GSNormalAcc(2345, "Siddhant_2", 0.0f, 100.0f);
		
		System.out.println("#-----------------Invoking the bookPorduct of class GSPrimeAcc ------------------#\n");
		primeAccObj.bookProduct(345.5f);
		
		System.out.println("\n");
		
		System.out.println("#-----------------Invoking the bookPorduct of class GSNormalAcc ------------------#\n");
		normalAccObj.bookProduct(456.0f);
		
		// Invoke toString method.
		System.out.println(primeAccObj+"\n");
		System.out.println(normalAccObj);
       
		
	}

}
