package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//  taking the class as final  is strategyDP rule no:3
@Component("fpkt")
public final class Flipkart {
	@Autowired  //Field Injection
	@Qualifier("dhl")
	private  ICourier  courier;  //HAS-A property   (strategyDP rule no:1,2)
	
	public Flipkart() {
		System.out.println("Flipkar:: 0-param  construtor");	
		}
	
	// business method
	public  String  shopping(String items[], double  prices[]) {
		System.out.println("Flipkart.shopping()");
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
