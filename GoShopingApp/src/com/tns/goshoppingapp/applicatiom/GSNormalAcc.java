package com.tns.goshoppingapp.applicatiom;
import com.tns.goshoppingapp.framework.NormalAcc;


public class GSNormalAcc extends NormalAcc {
	

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		
	}

	@Override
	public void bookProduct(float charges) 
	{
		float charges1 = charges + NormalAcc.getDeliveryCharges();
		
		System.out.println("Account No: "+NormalAcc.getAccNo()+"\n"
				            +"Account Holder Name: "+NormalAcc.getAccNm()+"\n"
				            +"Delivery changers: "+ NormalAcc.getDeliveryCharges()+"\n"
				            +"Total Charges: "+charges1+"\n"
				            );

	}

	@Override
	public void items(float items_obj) {
		System.out.println();
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getCharges()=" + getCharges() + "]";
	}

	
}
