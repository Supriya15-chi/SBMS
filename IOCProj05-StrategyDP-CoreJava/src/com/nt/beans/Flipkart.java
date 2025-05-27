package com.nt.beans;

import java.util.Arrays;
import java.util.Random;
//  taking the class as final  is strategyDP rule no:3
public final class Flipkart {
	private  ICourier  courier;  //HAS-A property   (strategyDP rule no:1,2)
	
	//setter method of  assignment
	public  void  setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	
	// business method
	public  String  shopping(String items[], double  prices[]) {
		//calcaulate the bill amount
		double billAmt=0.0;
		for(double p:prices)
			billAmt=billAmt+p;
		
	   //generate the order id
	    int oid=new Random().nextInt(1000);
	   //deliver  items
	String  msg=courier.deliver(oid);
	   // send final  message
	return   Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)+" bill amount::"+billAmt+"..."+msg;
	}
}
